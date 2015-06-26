package com.ordenacao.utilitarios;

import java.util.Random;

public class Gerador {
	
	Random gerador = new Random();
	private int numeros;
	
	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public void gerarNumeros(int numero){
		
		System.out.println("Gerando numero: " + gerador.nextInt(numero));
	}

}
