import java.util.Scanner;

public class Doublon {
    public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("a = ");
		int a = scanner.nextInt();
		System.out.println("b = ");
		int b = scanner.nextInt();
		System.out.println("c = ");
		int c = scanner.nextInt();
		scanner.close();
		
		if (a == b && b == c && a == c) {
			System.out.println("attention, certaines valeurs sont identiques!");
		}
			
		else if (a!=b && b!= c && a!=c) {
			System.out.println("Les valeurs sont différentes, il n'y a pas de doublon."); 
	}
	}
}