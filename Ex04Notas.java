package JavaExercicios.Modulo11VetoresMatrizes;

import java.util.Scanner;

public class Ex04Notas {

	public static void main(String[] args) {
		
		int linha, coluna;
		double soma = 0;
		double matriz [] [] = new double [10][4];
		double vetorMedia [] = new double[10];
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0; linha<=9; linha++) {
			for(coluna=0; coluna<=3; coluna++) {
				
				System.out.println("Entre com a "+(coluna+1)+" nota: ");
				matriz[linha][coluna] = ler.nextDouble();	
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
