package com.ordenacao.operational;

import java.util.Scanner;

import com.ordenacao.utilitarios.Gerador;

public class ClasseExecutavel {
	
	private static int quantidadeDeNumeros;
	private static int numeros;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de numeros: ");
		quantidadeDeNumeros = input.nextInt();
		
		Gerador[] vetorNumeros = new Gerador[quantidadeDeNumeros];
		
		for(int contador = 0; contador < quantidadeDeNumeros; contador++){
			Gerador numero = new Gerador();
			
			System.out.print("Entre com o numero: ");
			numeros = input.nextInt();
			//numero.gerarNumeros(numeros);
			
			vetorNumeros[contador] = numero;
			
			System.out.println("Numero: " + vetorNumeros[contador]);
		}
	}

}
