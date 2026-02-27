

import java.util.Scanner;

public class Presentation {
	
	public static void main(String[ ] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veillez entrer votre nom : " );
		String name = sc.nextLine();
		
		System.out.println("Veillez entrer votre prénom : " );
		String lastname = sc.nextLine();
		
		System.out.println("Je m'appelle   " + name + "  " + lastname);
	}
}