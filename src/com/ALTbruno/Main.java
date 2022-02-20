package com.ALTbruno;

import com.ALTbruno.questao1.Escada;
import com.ALTbruno.questao2.Senha;
import com.ALTbruno.questao3.Anagrama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Escada escada = new Escada();
        Senha senha = new Senha();
        Anagrama anagrama = new Anagrama();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do programa que deseja executar: \n 1 - Construir Escada \n 2 - Verificar Senha \n 3 - Anagramas");
        int escolha = scanner.nextInt();

        switch(escolha) {
            case 1:
                System.out.println("Você selecionou a Opção 1: Construir Escada");
                escada.contruirEscada();
                break;
            case 2:
                System.out.println("Você selecionou a Opção 2: Verificar Senha");
                senha.verificarSenha();
                break;
            case 3:
                System.out.println("Você selecionou a Opção 3: Anagramas");
                anagrama.encontrarAnagramas();
                break;
            default:
                System.out.println("Opção inválida! Você deve escolher 1, 2 ou 3.");
        }
    }
}
