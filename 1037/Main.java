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

		double a = Double.parseDouble(s.next());

		if (a < 0 || a > 100) {
			System.out.println("Fora de intervalo");
			System.exit(0);
		}

		StringBuilder result = new StringBuilder();
		result.append("Intervalo ");

		if (a >= 75) {
			result.append(a == 75 ? "[75,100]" : "(75,100]");
		} else if (a > 50) {
			result.append(a == 50 ? "[50,75]" : "(50,75]");
		} else if (a > 25) {
			result.append(a == 25 ? "[25,50]" : "(25,50]");
		} else {
			result.append("[0,25]");
		}

		System.out.println(result.toString());
	}

}
