import java.util.Arrays;
public class inputConversor {
	
	private int numeroDecConvertido[] = new int[32];
	private int numeroIntConvertido[] = new int[32];
	private int cociente,resto,parteEntera;
	private float intFloat,decFloat,parteDecimal;
	private int n;
	private String strIntConvertido,strFloatConvertido;

	public inputConversor() {
		
		// TODO Auto-generated constructor stub
	}

	public String pasarDecABinario(int numeroDec){
		n = 0;
		strIntConvertido = null;
		Arrays.fill(numeroIntConvertido, 0);
		System.out.println("nuestro Int vale antes de procesar: "+strIntConvertido);
		
		do{
			System.out.println("Vamos a convertir el int: "+numeroDec+" a binario");
			resto = numeroDec % 2;
			cociente = numeroDec / 2;
			numeroDec = cociente;
			numeroIntConvertido[31-n] = resto;
			n = n+1;
			
		}while (cociente>=2);
		
		numeroIntConvertido[31-n] = cociente;
		
		strIntConvertido = Arrays.toString(numeroIntConvertido);
		strIntConvertido = strIntConvertido.replace(" ","");
		strIntConvertido = strIntConvertido.replace(",","");
		strIntConvertido = strIntConvertido.replace("[","");
		strIntConvertido = strIntConvertido.replace("]","");
		System.out.println(strIntConvertido);
		return strIntConvertido;
		
	}
	public String pasarFloatABinario(float numeroFloat){
		
		

		n = 0;

		System.out.println("parteDecimal vale: "+parteDecimal);
		System.out.println("parteEntera vale: "+parteEntera);

		do{
			decFloat = (numeroFloat*2)%1.f;
			intFloat = (int)(numeroFloat*2);
			numeroDecConvertido[n] = (int)intFloat;
			n=n+1;
			numeroFloat = decFloat;	
							
		}while (decFloat!=0);
			numeroDecConvertido[31-n] = cociente;
			strFloatConvertido = Arrays.toString(numeroDecConvertido);
			strFloatConvertido = strFloatConvertido.replace(" ","");
			strFloatConvertido = strFloatConvertido.replace(",","");
			strFloatConvertido = strFloatConvertido.replace("[","");
			strFloatConvertido = strFloatConvertido.replace("]","");
			System.out.println(strFloatConvertido);
			return strFloatConvertido;
	}
}

	

