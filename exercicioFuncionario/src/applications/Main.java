package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario(); 
		
		System.out.println("Digite o nome do funcion�rio:");
		funcionario.nome = sc.nextLine();
		System.out.println("Digite o sal�rio bruto do funcion�rio:");
		funcionario.salario = sc.nextDouble();
		System.out.println("Digite o desconto sobre o sal�rio do funcion�rio:");
		funcionario.desconto = sc.nextDouble();
		
		System.out.println(funcionario.nome + ", $ " +String.format("%.2f", funcionario.liquido()) );
		
		System.out.println("Digite a porcentagem de aumento do sal�rio do " + funcionario.nome);
		funcionario.porcentagem = sc.nextDouble();
		
		System.out.println(funcionario.nome + ", $ " +String.format("%.2f", funcionario.aumento()) );
	}

}
