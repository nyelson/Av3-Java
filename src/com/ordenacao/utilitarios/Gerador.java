package com.ordenacao.utilitarios;

/*
 * 2. Criar a classe "Gerador". Esta classe deve possuir dois métodos: (i) "gerarVetor",
 que cria um vetor de inteiros aleatórios (tamanho passado por parâmetro) e (ii) "gerarVetorOrdenado",
  que cria um vetor ordenado de inteiros aleatórios (tamanho passado por parâmetro).

 */

import java.util.Random;

public class Gerador {
	
	private final static int MULTIPLICADOR = 10;
	private static int contador;
	
	static Random gerador = new Random();
	private int numeros;
	
	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public void gerarVetor(int tamanho){
		
		int[] vetorNumeros = new int[tamanho];	
		
		for(contador = 0; contador < tamanho; contador++){
		
			vetorNumeros[contador] = gerador.nextInt((int) (Math.random() * MULTIPLICADOR));
		}
		
	}
	/*
	 *  public static int separar(int[] vetor, int inicio, int fim)
	   {
	      int pivo = vetor[inicio];
	      int i = inicio + 1, f = fim;
	      while (i <= f)
	      {
	         if (vetor[i] <= pivo)
	            i++;
	         else if (pivo < vetor[f])
	            f--;
	         else
	         {
	            int troca = vetor[i];
	            vetor[i] = vetor[f];
	            vetor[f] = troca;
	            i++;
	            f--;
	         }
	      }
	      vetor[inicio] = vetor[f];
	      vetor[f] = pivo;
	      return f;
	   }
	 */
	public static int gerarVetorOrdenado(int tamanho){
		
		int inicio;
		int fim;		
		
		int[] vetorOrdenado = new int[tamanho];		
		
		inicio = vetorOrdenado[tamanho - tamanho];
		fim = vetorOrdenado[tamanho-1];
		
		int pivo = vetorOrdenado[inicio];
		
		while (inicio <= fim){
	         if (vetorOrdenado[inicio] <= pivo)
	            inicio++;
	         else if (pivo < vetorOrdenado[fim])
	            fim--;
	         else{
	            int troca = vetorOrdenado[inicio];
	            vetorOrdenado[inicio] = vetorOrdenado[fim];
	            vetorOrdenado[fim] = troca;
	            inicio++;
	            fim--;
	         }
	         vetorOrdenado[inicio] = vetorOrdenado[fim];
	         vetorOrdenado[fim] = pivo;
		     
		   }
		
		 return fim;
	}

}
