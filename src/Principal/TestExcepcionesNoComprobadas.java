package Principal;

public class TestExcepcionesNoComprobadas {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		try {
			int resultado = x / y;
			System.out.println("Resultado: " + resultado);
		}catch (ArithmeticException e) {
			System.out.println("Error: Division por cero.");
		}

	}

}
