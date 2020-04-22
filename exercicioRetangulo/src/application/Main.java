package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura e a largura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo);

	}

}
