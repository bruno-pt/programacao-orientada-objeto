package Aula9;

import java.util.Scanner;

public class Ex2 {
	
	public static String convert(int num) {
		String vetRom[] = {"CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int vetNum[] = {900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		String convertRom = "";

		int i = 0;

		while(num > 0) {
			if(num >= vetNum[i]){
				convertRom = convertRom + vetRom[i];
				num -= vetNum[i];
			}
			else i++;
		}
		return convertRom;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para converter em romano > ");
		int num = sc.nextInt();

		System.out.println(num + " em romano > " + convert(num));
	}

}
