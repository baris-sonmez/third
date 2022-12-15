package assignment3;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir karekter giriniz");
		char karakter=scan.next().charAt(0);
		
		
		int  ascii= karakter;
		
		if((ascii >= 65) && (ascii <= 90) || ((ascii >=97 ) && (ascii <= 122)))
			
			System.out.println("girmis oldugunuz karakter bir harftir");
		else
			System.out.println("girmis oldugunuz karakter bir harf degildir");
	}

}
