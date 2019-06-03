package br.com.zup.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();

		int controle = 1;
		int valor;

		while (controle != 0) {
			System.out.println("Digite um número inteiro");
			valor = entrada.nextInt();

			if (valor != 0) {
				if (valor % 2 == 0) {
					pares.add(valor);
				} else {
					impares.add(valor);

				}

			}
			if (valor == 0) {
				controle = 0;
			}
		}
		int media = 0;

		for (Integer integer : pares) {
			media = integer + media;
		}
		media = media / pares.size();
		System.out.println("A media dos números pares é " + media);

		System.out.println("Os números impares que não entraram no cálculo são: ");
		for (Integer integer : impares) {

			System.out.print(integer + " ");
		}

	}

}
