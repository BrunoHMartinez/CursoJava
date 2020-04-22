import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		// PrintF somente quando há necessidade de formatação
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %f\n", measure);
		System.out.printf("Rouded (there decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal points: %.3f\n\n", measure);

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t AULA 2");

		Scanner sc = new Scanner(System.in);

		char x;
		// charAt lê a primeira letra de uma palavra, ideal para variáveis do tipo CHAR
		System.out.println("Digite o seu sexo:");
		//sc.nextLine lê a linha inteira!
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);

		sc.close();

	}

}
