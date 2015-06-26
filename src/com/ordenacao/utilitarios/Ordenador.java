package com.ordenacao.utilitarios;

public class Ordenador {

	 public static void ordenar(int[] vetor)
	   {
	      ordenar(vetor, 0, vetor.length - 1);
	   }

	   public static void ordenar(int[] vetor, int inicio, int fim)
	   {
	      if (inicio < fim)
	      {
	         int posicaoPivo = separar(vetor, inicio, fim);
	         ordenar(vetor, inicio, posicaoPivo - 1);
	         ordenar(vetor, posicaoPivo + 1, fim);
	      }
	   }

	   public static int separar(int[] vetor, int inicio, int fim)
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
}
