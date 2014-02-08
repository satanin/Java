import java.math.BigDecimal;

// Esta funci�n la encontr� por internet, el c�digo no es mio lo busqu�. La comento porque me he preocupado de saber que hacia cada l�nea.

public class round {

	// constructor de clase con 2 par�metros y n�mero float y el n�mero de decimales que queremos en formato int.
	public static float rounder(float d, int decimalPlace) {
        // Creamos un objeto BigDecimal y le asignamos el valor de nuestro float.
		BigDecimal bd = new BigDecimal(Float.toString(d));
		// Al objeto BigDecimal le asignamos mediante el m�todo setScale el n�mero de decimales que queremos y el
		// m�todo de redondeo en este caso ROUND_HALF_UP que redondea hacia arriba a partir de .5
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        // Devolvemos el valor redondeado en forma de float.
        return bd.floatValue();
    }
}
