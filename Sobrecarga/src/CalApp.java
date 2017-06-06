
public class CalApp {
public static void main(String[] args) {
	Calculadora calc = new Calculadora();
	
	calc.mostrarResultado(calc.suma("12","33"));

	
	
	System.out.println("Suma");
	System.out.println(calc.suma("12","33"));
	
	System.out.println("Suma");
	System.out.println(calc.suma("3","5","2"));
	
	System.out.println("Suma");
	System.out.println(calc.suma("3.2","2.3"));
	
	System.out.println("Suma");
	System.out.println(calc.suma("10.5","33.4","2.1"));
}
}
