import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
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
		
		if(Math.abs(b-c)<a && a<(b+c)) {
			System.out.printf("Perimetro = %s\n", String.format(Locale.US, "%.1f", a+b+c));
		}
		else {
			double area = ((a+b)*c)/2;
			System.out.printf("Area = %s\n", String.format(Locale.US, "%.1f", area));
		}
	}
}