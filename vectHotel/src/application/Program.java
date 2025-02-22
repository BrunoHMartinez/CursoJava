package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[10];

		System.out.println("How many rooms will be rent ?");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Rent #" + i + ":");
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room");
			int number = sc.nextInt();
			vect[number] = new Room(name, email);
		}

		System.out.println("\nBusy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);

			}
		}
	}
}
