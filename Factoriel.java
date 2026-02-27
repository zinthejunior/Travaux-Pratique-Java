/*Programme qui calcul le factoriel du nombre entré par l'utilisateur*/
import java.util.Scanner;

public class Factoriel{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre :");
		int nombre = sc.nextInt();
		
		if (nombre<0){
			System.out.println("Entrez un nombre positif");
		}
		else if(nombre==0){
			System.out.println("Le factoriel de 0 est 1");
		}
		else {
			long fact=1;
			for (int i=1 ; i<= nombre; i++){
				fact *= i;
			}
			System.out.println("Le factoriel de " + nombre + " est " +fact);
		}
	}
	
}