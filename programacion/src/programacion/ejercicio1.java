package programacion;

public class ejercicio1 {

	public static void main(String[] args) {

		int a = 10, b = 2;
		for (a = 2; a <= 300 && b < 20; a *= b) {
			a++;
		}

		System.out.println("Fin - a= " + a + " y b= " + b);
	}
}