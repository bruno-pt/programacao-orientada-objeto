package Aula9;

import java.util.Scanner;

public class Ex3 {
	
	public static String convertToString(String vetNames[], int number, int qntDig) {
		int numberAux;
		int div;

		if(qntDig == 3) div = (int)(number / 1000) * 1000;
		else if(qntDig == 2) div = (int)(number / 100) * 100;
		else div = (int)(number / 10) * 10;
		
		if(qntDig == 4) numberAux = number / 1000;
		else if(qntDig == 3) numberAux = (number - div) / 100;
		else if(qntDig == 2) numberAux = (number - div) / 10;
		else numberAux = number - div;
		
		return vetNames[numberAux];
	}
	
	public static void main(String[] args) {
		String vetNames[] = {"Zero", "Um", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};
				
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um numero de até 4 Digitos > ");
		
		int number = sc.nextInt();
		int qntDig;
		
		while(number > 9999) {
			System.err.printf("\nNumero invalido!\n\n");
			System.out.printf("Digite um numero de até 4 Digitos > ");
			number = sc.nextInt();
		}
		
		if(number>=1000) qntDig = 4;
		else if(number>=100) qntDig = 3;
		else if(number>=10) qntDig = 2;
		else qntDig = 1;
		
		while(qntDig != 0) {			
			System.out.printf("%s ", convertToString(vetNames, number, qntDig));
			qntDig--;
		}
	}

}
