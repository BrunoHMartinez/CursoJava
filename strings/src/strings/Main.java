package strings;

public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		//Converter a string toda para letras minusculas
		String s01 = original.toLowerCase();
		//Converter a string toda para letras maíusculas
		String s02 = original.toUpperCase();
		//Troca a primeira variável pela segunda 
		String s03 = original.replace('a', 'x');
		
		
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);

	}

}
