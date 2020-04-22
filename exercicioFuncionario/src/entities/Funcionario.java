package entities;

public class Funcionario {

	public String nome;
	public double salario, desconto, porcentagem;

 public double liquido() {
	 return salario - desconto;
	 
 }
 
 public double aumento() {
	 return liquido() + (salario * porcentagem) / 100;
 }

}

