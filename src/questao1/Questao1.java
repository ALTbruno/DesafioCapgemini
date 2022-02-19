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

		String base = "";
		int altura = 0;

		String caractere = "*";
		String espaco = " ";

		for(int i=1; i<=entrada; i++){

			altura++;

			String espacos = espaco.repeat(entrada-i);
			base = caractere.repeat(i);

			System.out.println(espacos.concat(base));

		}

//		System.out.println(altura);
//		System.out.println(base.length());

	}

}
