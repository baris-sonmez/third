package assignment3;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
	System.out.println("3 adet sayi giriniz");
	int sayi1=scan.nextInt();
	System.out.println("sayi1="+sayi1);
	int sayi2=scan.nextInt();
	System.out.println("sayi2="+sayi2);
	int sayi3=scan.nextInt();
	System.out.println("sayi3="+sayi3);
	
	if (sayi1>sayi2 && sayi1>sayi3) {
		System.out.println(sayi1 +"  en buyuk sayidir");
	}
	else if (sayi2>sayi3 && sayi2>sayi1 ) {
		System.out.println(sayi2 + "  en buyuk sayidir");
	}
	else if (sayi3>sayi1 && sayi3>sayi2) {
		System.out.println(sayi3+"  en buyuk sayidir");
	}
	}

}
