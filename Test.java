
/*Exercice 5: écris un programme qui demande à l'utilisateur d'entrer son age puis affiche s'il est majeur ou mineur*/
import java.util.Scanner;
public class Test {
	
	public static void main (String[] args){
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Veuillez entrer votre age");
		int old = scr.nextInt();	
		
		if (old<0){
			System.out.print("Veuillez entrer un age correcte !");
		}
		else if(old>0 && old<18){
			System.out.print("Vous ètes mineur !");
		}
		else {
			System.out.println("Vous ètes majeur " );
		}
	}
}