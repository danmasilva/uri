import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int a, b, c;
		a = Integer.parseInt(s.next());
		b = Integer.parseInt(s.next());
		c = Integer.parseInt(s.next());
		
		List<Integer> unsorted = new ArrayList(Arrays.asList(a, b, c));
		List<Integer> toSort = new ArrayList(Arrays.asList(a, b, c));
		
		Collections.sort(toSort);
		
		for (int d : toSort) {
			System.out.println(d);
		}
		
		System.out.println();
		
		for (int d : unsorted) {
			System.out.println(d);
		}
	}
}