package entities;

public class Estudante {

	public String nome;
	public double nota1, nota2, nota3, resultado;
	
	public double media() {
	    resultado= nota1 + nota2 + nota3;
	    
	    return resultado;
	}
	
	public void status() {
		if ( resultado >= 60) {
			System.out.println("Aprovado!");
		} else {
			resultado = 60 - resultado;
			System.out.println("Reprovado!");
			System.out.println("Faltaram " + resultado + " pontos");
		}			
	}
}
