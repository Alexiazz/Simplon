public class Variables {
public static void main(final String[] args) {
    //exo1
    char letter = 'a';
    int asciicode = (int) letter; 
    System.out.println("le code ascii "+ letter + " est " + asciicode);
    
    //exo2
    asciicode = asciicode - 32;
    char b = (char) asciicode; 
    System.out.println("la majuscule de "+ letter + " est " + b);
    
    //exo3
    int premier = 2;
    int deuxieme = 3;
    int troisieme = 100; 
    int moyenne = (premier + deuxieme + troisieme) / 3; 
    System.out.println(moyenne); 
    
    //exo4
    int num = 7;
    int autrenum = 2;
    int sum = (num+autrenum);
    int quotient = (num%autrenum);
    System.out.println("la somme des deux nombres est "+sum+ " et le quotient est "+quotient);

    //exo5
    int[]tab = {1,2,3,4,5};
    for (int i = 0; i < tab.length; i++) {
    System.out.println(tab[i]); 
}
    int[] result = {tab[3],tab[2], tab[4], tab[1], tab[0]};
    for (int i = 0; i < result.length; i++) {
    System.out.println(result[i]);
       }






    }  
}

