
import java.util.Scanner;

public class Notes
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisis ta note : ");
		int note = scanner.nextInt();
		scanner.close();
		if (note >= 10)
			System.out.println("Admis !");
		else
			if (note >= 8)
				System.out.println("Rattrapge.");
			else
				System.out.println("AjournÃ©... :-(");
		}
}
    
