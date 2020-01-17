import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		Map<Integer, Double> list = new HashMap<Integer, Double>();
		list.put(1, 4.0);
		list.put(2, 4.5);
		list.put(3, 5.0);
		list.put(4, 2.0);
		list.put(5, 1.5);

		int a, b;

		a = Integer.parseInt(s.next());
		b = Integer.parseInt(s.next());

		String price = String.format(Locale.US, "%.2f", list.get(a) * b);

		System.out.println("Total: R$ " + price);

	}

}
