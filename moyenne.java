/*Exercice: écris un programme qui demande à l'utilisateur d'entré 3 notes. 
Calcules la moyenne de ces notes puis affiche le résultats*/
import java.util.Scanner;
public class moyenne{
	public static void main (String[] args){
		//int a = 10, b=5, c=15;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la note N-1 :" );
		int a = sc.nextInt();
		
		System.out.print("Entrez la note N-2 :" );
		int b = sc.nextInt();
		
		System.out.print("Entrez la note N-3 :" );
		int c = sc.nextInt();
		
		int moy= (a+b+c)/3;
		
		System.out.print("La moyenne des notes " + moy );
		if (moy>=0){
			System.out.print("\n L'apprenant est admis!");
		}
		else {
			System.out.print("L'apprenant est ajourné!");
		}
	}
}