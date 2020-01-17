import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		double a, b, c;

		a = Double.parseDouble(s.next());
		b = Double.parseDouble(s.next());
		c = Double.parseDouble(s.next());

		double delta = 0, R1 = 0, R2 = 0;
		
		delta = Math.pow(b, 2) - (4 * a * c);
		
		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
			System.exit(0);
		}
		
		R1 = ((b * -1) + Math.sqrt(delta)) / (a * 2);
		R2 = ((b * -1) - Math.sqrt(delta)) / (a * 2);

		System.out.printf("R1 = %.5f\n", R1);
		System.out.printf("R2 = %.5f\n", R2);
	}

}