package com.ALTbruno.questao2;

import java.util.Scanner;

public class Senha {

//	Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
//	A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.
//	O site considera uma senha forte quando ela satisfaz os seguintes critérios:
//	- Possui no mínimo 6 caracteres.
//	- Contém no mínimo 1 digito.
//	- Contém no mínimo 1 letra em minúsculo.
//	- Contém no mínimo 1 letra em maiúsculo.
//	- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

//	Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
//	Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
//	para uma string qualquer ser considerada segura.

	private int caracteresAAdicionar = 0;

	public void verificarSenha() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua senha e depois tecle Enter para verificar.");
		String senha = scanner.nextLine();

		int tamanhoSenha = senha.length();

		boolean temDigito = senha.matches(".*[0-9].*");
		boolean temLetraMinuscula = senha.matches(".*[a-z].*");
		boolean temLetraMaiuscula = senha.matches(".*[A-Z].*");
		boolean temCaractereEspecial = senha.matches(".*[!@#$%^&*()+-].*");

		if (!temDigito) {
			caracteresAAdicionar++;
		}

		if (!temLetraMinuscula) {
			caracteresAAdicionar++;
		}

		if (!temLetraMaiuscula) {
			caracteresAAdicionar++;
		}

		if (!temCaractereEspecial) {
			caracteresAAdicionar++;
		}

		if ((tamanhoSenha + caracteresAAdicionar) < 6) {
			caracteresAAdicionar = 6 - tamanhoSenha;
		}

		System.out.println(caracteresAAdicionar);

//		if (caracteresAAdicionar > 0) {
//			System.out.println("Senha fraca! Caracteres necessários para torná-la forte: " + caracteresAAdicionar);
//		} else {
//			System.out.println("Muito bem! Sua senha é forte.");
//		}
	}
}
