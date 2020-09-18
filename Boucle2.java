import java.util.Scanner;

public class Boucle2 {
    
 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
 
System.out.println("Saissisez le nombre dont vous voulez la table : ");

int nombre = sc.nextInt();
int table = 0;

for (int i = 1; i<=10; i++){

table = i * nombre; 
System.out.println(i + "x" + nombre + "=" + table);
}
}
    }
