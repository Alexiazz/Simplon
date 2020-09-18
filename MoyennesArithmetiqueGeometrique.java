import java.util.Scanner; 
 
 public class MoyennesArithmetiqueGeometrique {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez un nombre : ");
        float a = sc.nextFloat();
        System.out.println("Choississez un autre nombre : ");
        float b = sc.nextFloat();

        double resultat = ((a + b) / 2) - (Math.sqrt((a*b)));

        System.out.println("le résultat est "+ resultat);
     }
    }
