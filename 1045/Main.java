import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

		double a, b, c;
		a = Double.parseDouble(s.next());
		b = Double.parseDouble(s.next());
		c = Double.parseDouble(s.next());

		List<Double> toSort = new ArrayList<Double>(Arrays.asList(a, b, c));
		
		class Decrescente implements Comparator<Double> 
		{ 
		    public int compare(Double a, Double b) 
		    { 
		        return (int) (b - a); 
		    } 
		} 
		
		Collections.sort(toSort, new Decrescente());
		
		double a1,b1,c1;
		a1 = toSort.get(0);
		b1 = toSort.get(1);
		c1 = toSort.get(2);

		if (a1 >= b1 + c1) {
			System.out.println("NAO FORMA TRIANGULO");
			System.exit(0);
		}
		if (Math.pow(a1, 2) == Math.pow(b1, 2) + Math.pow(c1, 2)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if (Math.pow(a1, 2) > Math.pow(b1, 2) + Math.pow(c1, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (Math.pow(a1, 2) < Math.pow(b1, 2) + Math.pow(c1, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b & a == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if (((a!=b && b==c) || (b!=c && a == c)) || (a!=c && b == a)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}