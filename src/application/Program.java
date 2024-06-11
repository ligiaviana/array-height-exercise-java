package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person vect[] = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a" + " pessoa: ");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);
		}

		double altura = 0.0;
		for (int i = 0; i < n; i++) {
			altura += vect[i].height;
		}
		double avg = altura / n;
		System.out.printf("Altura média: %.2f%n", avg);

		System.out.println("Pessoas com menos de 16 anos: ");
		for (int i = 0; i < n; i++) {
			if(vect[i].age < 16) {
				System.out.println(vect[i].name);
			}
		}

		sc.close();
	}
}
