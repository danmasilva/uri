import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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

		double a, b, c, d, media;
		StringBuilder result = new StringBuilder();
		
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
		DecimalFormat df = (DecimalFormat) nf;
		
		df.applyPattern("#0.0");
		
		a = Double.parseDouble(s.next());
		b = Double.parseDouble(s.next());
		c = Double.parseDouble(s.next());
		d = Double.parseDouble(s.next());

		media = (a*2 + b*3 + c*4 + d) / 10;
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
			System.exit(0);
		} else if (media >= 5.0) {
			System.out.println("Aluno em exame.");
		} else {
			System.out.println("Aluno reprovado.");
			System.exit(0);
		}

		// aluno em exame
		double e = Double.parseDouble(s.next());
		System.out.println("Nota do exame: " + df.format(e));
		
		media = (media + e)/2;
		
		if(media>=5.0) {
			System.out.println("Aluno aprovado.");
		}else {
			System.out.println("Aluno reprovado.");
		}
		System.out.println("Media final: " + df.format(media));

	}

}
