package JavaExercicios.Modulo11VetoresMatrizes;

import java.util.Scanner;

public class Ex01EncontreNo {

	public static void main(String[] args) {
		
		int num, x;
		boolean procura = false;
		Scanner leia = new Scanner (System.in);
		
		int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite o número que você deseja encontrar");
		num = leia.nextInt();
		
		for (x=0;x<vetor.length;x++) {
			
			if(num == vetor[x]) {
				procura = true;
				System.out.println("\n O número "+num+" está na posição "+x);	
			}
			}
			
		if(! procura) {
			System.out.println("\n O número "+num+" não foi encontrado!");
		}
	}

} 
