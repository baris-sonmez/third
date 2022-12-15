package assignment3;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yuz uzerinden notunuzu giriniz");
		short notunuz=scan.nextShort();
		
		if (notunuz>=80 && notunuz<=100) {
			System.out.println("A");
		}
		else if (notunuz>=60 && notunuz<80) {
			System.out.println("B");
		}
		else if (notunuz >=50 && notunuz<60) {
			System.out.println("C");
		}
		else if (notunuz<50) {
			System.out.println("D");
			
		}
		else {
			System.out.println("hatali giris yaptiniz");
		}
	}

}
