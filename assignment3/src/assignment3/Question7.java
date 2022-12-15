package assignment3;

import java.util.Scanner;

public class Question7 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		String durum=(sayi % 5 == 0) ? 
				(sayi % 10 == 0 ? "5’e bölünen çift sayı" : "5’e bölünen tek sayı"):"Tekrar deneyin"; 
		
		System.out.println(durum);
		
		
		
	}

}
