package assignment3;

import java.util.Scanner;

public class Question2 {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
	
		String gun;

		System.out.println("bir gun giriniz");
		gun = scan.nextLine();

	             	String day = gun.equals("cumartesi") || gun.equals("pazar")
				? (gun.equals("cumartesi") ? "Cumartesi ve hafta sonu" : "Pazar ve hafta sonu") : (" hafta ici");
	            	System.out.println("gun= " + day);

	
	}

}
