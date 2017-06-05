
public class Calculadora {
	
	public int suma(int a, int b){
		return a+b;
	}
	public int suma(int a, int b, int c){
		return a+b+c;
	}
	public double suma(double a, double b){
		return a+b;
	}
	public double suma(double a, double b, double c){
		return a+b+c;
	}
	public double suma( String...params ){
		double acumulador = 0;
		try
		{
			for(int i=0;i<params.length;i++)
			{
			acumulador += Double.parseDouble(params[i]);
			}
		}catch(NumberFormatException e)
		{
			System.out.println( "Disculpe ud ingreso un valor incorrecto" );
		}
		return acumulador;
	}
}
