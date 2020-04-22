package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante(); 
		
		System.out.println("Digite o nome do aluno:");
		estudante.nome = sc.nextLine();
		
		System.out.println("Digite as 3 notas referentes aos trimestres:");
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.println("A media final de " + estudante.nome + " foi: " + estudante.media());
		
		estudante.status();
	}

}
