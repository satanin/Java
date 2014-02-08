import java.math.BigDecimal;

// Esta función la encontré por internet, el código no es mio lo busqué. La comento porque me he preocupado de saber que hacia cada línea.

public class round {

	// constructor de clase con 2 parámetros y número float y el número de decimales que queremos en formato int.
	public static float rounder(float d, int decimalPlace) {
        // Creamos un objeto BigDecimal y le asignamos el valor de nuestro float.
		BigDecimal bd = new BigDecimal(Float.toString(d));
		// Al objeto BigDecimal le asignamos mediante el método setScale el número de decimales que queremos y el
		// método de redondeo en este caso ROUND_HALF_UP que redondea hacia arriba a partir de .5
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        // Devolvemos el valor redondeado en forma de float.
        return bd.floatValue();
    }
}
