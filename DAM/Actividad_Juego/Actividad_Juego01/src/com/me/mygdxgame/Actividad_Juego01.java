package com.me.mygdxgame;

import java.util.Iterator;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

public class Actividad_Juego01 implements ApplicationListener {
	OrthographicCamera camera;
	SpriteBatch batch;
	Texture dropImage;
	Texture bucketImage;
	Sound dropSound;
	Music rainMusic;
	Rectangle bucket;
	Array<Rectangle> raindrops;
	long lastDropTime;
	
	
	@Override
	public void create() {		
		dropImage = new Texture(Gdx.files.internal("data/droplet.png"));
		bucketImage = new Texture(Gdx.files.internal("data/bucket.png"));
			
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false,800,480);
		batch = new SpriteBatch();
	

		
		dropSound = Gdx.audio.newSound(Gdx.files.internal("data/drop.wav"));
		rainMusic = Gdx.audio.newMusic(Gdx.files.internal("data/rain.mp3"));
		
		rainMusic.setLooping(true);
		rainMusic.play();
		
		bucket = new Rectangle();
		bucket.x = 800 / 2 - 64 / 2;
		bucket.y = 20;
		bucket.width = 64;
		bucket.height = 64;
		
		raindrops = new Array<Rectangle>();
		spawnRaindrop();
	}
   private void spawnRaindrop() {
	      Rectangle raindrop = new Rectangle();
	      raindrop.x = MathUtils.random(0, 800-64);
	      raindrop.y = 480;
	      raindrop.width = 64;
	      raindrop.height = 64;
	      raindrops.add(raindrop);
	      lastDropTime = TimeUtils.nanoTime();
	   }

	@Override
	public void render() {		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		// actualizar la camara cada frame.
		camera.update();
		
		// Decirle a SpriteBacth que renderice en el sistema de coordenadas
		// que especifica la cámara.
		batch.setProjectionMatrix(camera.combined);

		// Dibujar el cubo y las gotas de lluvia
		batch.begin();
		batch.draw(bucketImage,bucket.x, bucket.y);
		for (Rectangle raindrop:raindrops){
			batch.draw(dropImage, raindrop.x,raindrop.y);
		}
		batch.end();
		
		// Movimiento
		// Con este if moveremos el cubo donde estén tocando la pantalla, como esto es del tutorial sólo lo movemos en X
		if(Gdx.input.isTouched()){
			Vector3 touchPos = new Vector3();
			touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
			camera.unproject(touchPos);
			bucket.x = touchPos.x - 64 / 2;
			bucket.y = touchPos.y - 64 / 2;
		}
		// Con estos if, movemos el cubo si alguien toca las teclas izquierda o derecha.
		if(Gdx.input.isKeyPressed(Keys.LEFT)) bucket.x -= 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) bucket.x += 200 * Gdx.graphics.getDeltaTime();
		// Con estos if movemos el cubo si alguien toca las teclas arria o abajo.
		// if(Gdx.input.isKeyPressed(Keys.UP)) bucket.y -= 200 * Gdx.graphics.getDeltaTime();
		// if(Gdx.input.isKeyPressed(Keys.DOWN)) bucket.y += 200 * Gdx.graphics.getDeltaTime();

		// Aquí hacemos que el cubo nunca pueda salirse por los lados limitando su movimiento. 
		if(bucket.x < 0) bucket.x = 0;
		if(bucket.x > 800 - 64) bucket.x = 800 - 64;
		// Aquí limitamos su movimiento en y.
		// if(bucket.y < 0) bucket.y = 0;
		// if(bucket.y > 480 - 64) bucket.y = 480 - 64;
		
		
		// mirar a ver si hace falta otra gota de lluvia
		if (TimeUtils.nanoTime() - lastDropTime > 1000000000) 
			spawnRaindrop();
		
		// Mover las gotas de agua por la pantalla y quitar las que entran en el cubo o bien
		// se salen de la pantalla. Reproducir sonido
		
		Iterator<Rectangle> iter = raindrops.iterator();
		while(iter.hasNext()){
			Rectangle raindrop = iter.next();
			raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
			if (raindrop.y + 64 <0) iter.remove();
			if (raindrop.overlaps(bucket)){
				dropSound.play();
				iter.remove();
			}
		}
		
	}
	
	@Override
	public void dispose() {
		// dispose todos los recursos
		dropImage.dispose();
		bucketImage.dispose();
		dropSound.dispose();
		rainMusic.dispose();
		batch.dispose();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
