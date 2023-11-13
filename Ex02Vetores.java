package JavaExercicios.Modulo11VetoresMatrizes;

import java.util.Scanner;

public class Ex02Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int x, soma = 0, num=0;
		double media;
		int vetor[] = new int[10];
		
		for(x=0 ; x<10 ; x++) {
			System.out.println("Digite o "+(x+1)+"º número: ");
			vetor[x] = leia.nextInt();		
			soma += vetor[x];
		} 
		
		System.out.println("\nElementos nos índices ímpares: ");				
		for(x=1 ; x<vetor.length ; x+=2) {
			System.out.println(vetor[x]);
		}
		
		System.out.println("\nElementos pares: ");
		for(x=0; x<vetor.length; x++) {
			if(vetor[x] %2 ==0) {
				System.out.println(vetor[x]);
			}
		}
		
		System.out.println("\nSoma: "+soma);
		media = (float)soma / 10;
		System.out.println("\nMédia: "+media);
	}

}

