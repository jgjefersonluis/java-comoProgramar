package br.com.capitulo02.introducao;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// cria um Scanner para obter entrada da janela de comando.
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		sum = number1 + number2;

		System.out.printf("Sum is %d\n", sum);

	}

}
