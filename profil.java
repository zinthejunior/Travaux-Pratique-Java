/*Exercice 2: écris un promme qui déclare votre nom, votre age et votre taille et 
qui affiche "je m'appelle..., je mesure... mon age est ... ans*/

import java.util.Scanner;
public class profil{
	public static void main (String[] args){
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Veuillez entrer votre nom : ");
		String nom = scr.nextLine();		
		
		System.out.print("Veuillez entrer votre age : ");
		int age = scr.nextInt();
		
		System.out.print("Veuillez entrer votre taille : ");
		double taille = scr.nextDouble();
		
		System.out.print("Je m'appelle "+nom+". Je mesure "+taille+", mon age est "+age+"ans");
	}
}