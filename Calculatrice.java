import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisis une valeur :");
		int a = sc.nextInt();
		System.out.println("Saisis un opérateur :");
		char op = sc.next().charAt(0);
		System.out.println("Saisis une valeur :");
		int b = sc.nextInt();
		int resultat = 0;
		boolean erreur = false;
		switch (op)
		{
		case '+' : resultat = a + b;break;
		case '-' : resultat = a - b;break;
		case '*' : resultat = a * b;break;
		case '/' : resultat = a / b;break;
		default : erreur = true;
		}
		if (erreur)
			System.out.println("Operateur inconnu\n");
		else
			System.out.println("" + a + op + b + "=" + resultat);
		sc.close();
	}

}