package questao3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Questao3 {

//		Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas
//		para formar a outra palavra.Dada uma string qualquer, desenvolva um algoritmo que encontre o número de
//		pares de substrings que são anagramas.

	public static void main(String[] args) {

		String palavra = "ovo";

		String[] p = palavra.split("");

		Set<Object> anagramas = new HashSet<>();

		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();


		for (int a=0; a< p.length; a++) {
//			System.out.println("Rodando o primeiro loop");
			int b = a + 1;

			for (int i=0; i<p.length; i++) {
//				System.out.println("	Rodando o segundo loop");

				for (int j=i+1; j<p.length; j++) {
//					System.out.println("		Rodando o terceiro loop");

					arr1.add(p[i]);
					arr2.add(p[j]);

//					System.out.println("			Arr1 " + arr1 + " - " + "Arr2 " + arr2);

					ArrayList<String> sortedArr1 = new ArrayList<>(arr1);
					ArrayList<String> sortedArr2 = new ArrayList<>(arr2);

					Collections.sort(sortedArr1);
					Collections.sort(sortedArr2);

					if (sortedArr1.equals(sortedArr2)) {
//						System.out.println("Deu bom aqui -> " + arr1 + arr2);
						anagramas.add(arr1);
						anagramas.add(arr2);
					}

//					System.out.println("Limpando");
					arr1.clear();
					arr2.clear();

				}

			}
			arr1.add(p[a]);
			if(b < p.length) {
				arr2.add(p[b]);
			}

		}

		System.out.println(anagramas.size());

	}

}
