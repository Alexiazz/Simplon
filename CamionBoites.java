import java.util.Scanner; 

public class CamionBoites {

public static void main(String[] args){

Scanner sc = new Scanner (System.in);
System.out.println("capacité du camion : ");
float capaciteCamion = sc.nextFloat();

System.out.println("poids du carton : ");
float poidsCarton = sc.nextFloat ();

float nombreDeCartons = capaciteCamion / poidsCarton; 
System.out.println("on peut mettre " + nombreDeCartons + "dans le camion");
sc.close();
}
}