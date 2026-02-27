/*Ecris un programme qui demande à l'utilisateur d'entré deux entiers et
 retourne le plus grande entier*/
import java.util.Scanner;
public class Max_entre_deux_nombre {
	
	public static void main (String[] args){
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Veuillez entrer un entier A : ");
		int entierA = scr.nextInt();	
		
		System.out.print("Veuillez entrer un entier B défférent de l'entierA: ");
		int entierB = scr.nextInt();	
		
		if (entierA>entierB){
			System.out.print("Le plus grand entier est : " + entierA );
		}
		else {
			System.out.println("Le plus grand entier est : " + entierB );
		}
	}
}