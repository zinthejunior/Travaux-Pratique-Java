import java.util.Scanner;

public class Presentation2 {
	
	public static void main(String[ ] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veillez entrer votre nom : " );
		String name = sc.nextLine();
		
		System.out.println("Veillez entrer votre age : " );
		int old = sc.nextInt();
		
		System.out.println("Bienvenu  " + name + " vous avez " + old);
	}
}