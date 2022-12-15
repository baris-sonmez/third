package assignment3;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen haftanin bir gununu yaziniz");
		String kutsalGun=scan.nextLine();
		
		
		switch (kutsalGun) {
		
		case "cuma" : System.out.println("bugun muslumanlar icin kutsal bir gundur");
		break;
		
		case "cumartesi" : System.out.println("bugun yahudiler icin kutsal bir gundur");
		break;
		
		case "pazar" : System.out.println("bugun hristiyanlar icin kutsal bir gundur");
		break;
		default : System.out.println("bugun kutsal bir gun degildir");
		}
		
		scan.close();
	}

	}


