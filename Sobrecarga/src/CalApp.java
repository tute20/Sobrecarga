
public class CalApp {
public static void main(String[] args) {
	Calculadora calc = new Calculadora();
	
	calc.mostrarResultado(calc.suma("12","33"));

	calc.mostrarResultado(calc.suma("33.5", "12.5"));
	
	calc.mostrarResultado(calc.suma(10, 20, 30));
	
	calc.mostrarResultado(calc.suma(2.5, 3.1, 8.4));
	
	calc.mostrarResultado(calc.suma("15", "30", "25"));
}
}
