package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;


public class Zombies implements ApplicationListener {
	// Creamos lo que necesitamos para nuestra pantalla de juego.
	OrthographicCamera camera;
	SpriteBatch batch;
	Texture zombiImage;
	Music backgroundMusic;
	Rectangle zombi;
	Sound stepSound;
	Sound brainSound;
	int sonido;
	
	@Override
	public void create() {	
		// Cargamos la textura en nuestro zombi.
		zombiImage = new Texture(Gdx.files.internal("data/zombi.png"));

		
		// creamos una cámara ortográfica
		camera = new OrthographicCamera();
		camera.setToOrtho(false,800,480);
		
		// creamos nuestro scenario 2D
		batch = new SpriteBatch();
	
		// Cargamos la música de fondo
		backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("data/fondo.mp3"));
		stepSound = Gdx.audio.newSound(Gdx.files.internal("data/pasos.wav"));
		brainSound = Gdx.audio.newSound(Gdx.files.internal("data/cerebro.mp3"));
		
		// Hacemos que la música de fondo se ponga en modo loop y la reproducimos.
		backgroundMusic.setLooping(true);
		backgroundMusic.play();
		
		// Creamos nuestro Zombi, lo posicionamos (en mi caso en el centro de la pantalla) y le damos un tamaño 64x64.
		zombi = new Rectangle();
		zombi.x = 800 / 2 - 64 / 2;
		zombi.y = 480 / 2 - 64 / 2;
		zombi.width = 64;
		zombi.height = 64;	
	}

	@Override
	public void dispose() {
		// hacemos que se elimine todo lo que dejamos de utilizar
		zombiImage.dispose();
		batch.dispose();
		backgroundMusic.dispose();

	}

	@Override
	public void render(){
		// empezamos a renderizar poniendo la pantalla de color azul oscuro
		Gdx.gl.glClearColor(0,0,0.2f,1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		// actualizamos la cámara
		camera.update();
		
		// Decirle a SpriteBacth que renderice en el sistema de coordenadas
		// que especifica la cámara.
		batch.setProjectionMatrix(camera.combined);
	
		// Dibujar el zombi en su posicion ACTUAL
		batch.begin();
		batch.draw(zombiImage,zombi.x, zombi.y);
		batch.end();
		
		sonido = (int)(Math.random() * ((100 - 1) + 1));
		// Movimiento
		// Con este if moveremos el zombi donde estén tocando la pantalla tanto con el dedo si es tactil como con un ratón
		if(Gdx.input.isTouched()){
			Vector3 touchPos = new Vector3();
			touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
			camera.unproject(touchPos);
			zombi.x = touchPos.x - 64 / 2;
			zombi.y = touchPos.y - 64 / 2;
			stepSound.play();
			if(sonido<10){
				brainSound.play();
			}
		}
		// Con estos if, movemos el cubo si alguien toca las teclas izquierda o derecha.
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			zombi.x -= 200 * Gdx.graphics.getDeltaTime();
			stepSound.play();
			if(sonido<5){
				brainSound.play();
			}
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			zombi.x += 200 * Gdx.graphics.getDeltaTime();
			stepSound.play();
			if(sonido<5){
				brainSound.play();
			}
		}
		// Con estos if movemos el cubo si alguien toca las teclas arria o abajo.
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			zombi.y += 200 * Gdx.graphics.getDeltaTime();
			stepSound.play();
			if(sonido<5){
				brainSound.play();
			}
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			zombi.y -= 200 * Gdx.graphics.getDeltaTime();
			stepSound.play();
			if(sonido<10){
				brainSound.play();
			}
		}
	
		// Aquí hacemos que el cubo nunca pueda salirse por los lados limitando su movimiento. 
		if(zombi.x < 0) zombi.x = 0;
		if(zombi.x > 800 - 64) zombi.x = 800 - 64;
		// Aquí limitamos su movimiento en y.
		if(zombi.y < 0) zombi.y = 0;
		if(zombi.y > 480 - 64) zombi.y = 480 - 64;

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
