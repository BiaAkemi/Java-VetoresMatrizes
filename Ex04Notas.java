package JavaExercicios.Modulo11VetoresMatrizes;

import java.util.Scanner;

public class Ex04Notas {

	public static void main(String[] args) {
		
		int linha, coluna;
		float soma = 0;
		float matriz [] [] = new float [10][4];
		float vetorMedia [] = new float[10];
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0; linha<=9; linha++) {
			for(coluna=0; coluna<=3; coluna++) {
				
				System.out.println("Entre com a "+(coluna+1)+" nota: ");
				matriz[linha][coluna] = ler.nextFloat();	
				// somando colunas
				soma += matriz[linha][coluna];
				// média das colunas + zerando soma
			} vetorMedia [linha] = soma/4;
			soma=0;
		}
		
		for(double num: vetorMedia) {
			
			System.out.printf("\n %.1f",num);
		}
						
	}

}
