package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product [] vect = new Product [n];
		
		//Vect.lenght é o tamanho do vetor, excluindo a necessidade de usar uma váriavel nt
		for ( int i=0; i < vect.length; i++) {
			//Quebra de linha
			sc.nextLine();
			String name = sc.nextLine();
			double price =sc.nextDouble();
			vect[i] = new Product (name,price);	 
		}
		
		double sum = 0;
		for (int i=0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		
		
	}

}
