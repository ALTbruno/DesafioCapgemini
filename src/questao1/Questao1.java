package questao1;

import java.util.Scanner;

public class Questao1 {

//	Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
//	A base e altura da escada devem ser iguais ao valor de n.
//	A última linha não deve conter nenhum espaço.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira um número e depois tecle Enter.");
		int entrada = scanner.nextInt();

		String caractere = "* ";

		for(int i=1; i<=entrada; i++){

			if (i == entrada) {
				caractere = caractere.replace("* ", "*");
			}

			System.out.println(caractere.repeat(i));

		}
	}
}
