package assignment3;

import java.util.Scanner;

public class Question3 {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir gun adinin ilk harfini yaziniz");
		char ilkHarf=scan.next().charAt(0);
		
		
		switch (ilkHarf) {
		
		case 'p' : System.out.println("p ile baslayan gunler pazartesi,persembe,pazar");
		break;
		
		case 's' : System.out.println("s ile baslayan gunler sali");
		break;
		
		case 'c' : System.out.println("c ile baslayan gunler carsamba, cuma, cumartesi");
		}
		
		
	}

}
