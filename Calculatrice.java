import java.util.Scanner;
public class Calculatrice{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre n-1 :" );
		double num1 = sc.nextDouble();
		
		System.out.println("Entrer un nombre n-2 :" );
		double num2 = sc.nextDouble();
		
		System.out.println("Choisir l'opérateur : \n"
        + "- pour la soustraction\n"
        + "+ pour l'addition\n"
        + "* pour la multiplication\n"
        + "/ pour la division");
		
		char operateur = sc.next().charAt(0);
		
		double result;
		switch (operateur){
			case '-':
				result = num1 - num2;
				System.out.println("Le resultats de la soustraction entre " + num1 +" et "+ num2 + " est : " + result);
				break;
			case '+':
				result = num1 + num2;
				System.out.println("Le resultats l'additionentre " + num1 +" et "+ num2 + " est : " + result);
				break;
			case '*':
				result = num1 * num2;
				System.out.println("Le resultats de la multiplication entre " + num1 +" et "+ num2 + " est : " + result);
				break;
			case '/':
				if (num2==0){
					System.out.println("Opération non valide");
					}
				else {
				result = num1 / num2;
				System.out.println("Le resultats de la division entre" + num1 +" et "+ num2 + " est : "+ result);
				}
				break;
			default :
				System.out.println("Opérateur non valide");
		}
		
	}
}