import java.util.Scanner;

public class Boucle3 {
 public static void main(String[] args) {
        
       
        int [][]tab = new int[11][11];

        for (int  i = 1; i < tab.length; i++) {
            
            for (int j = 0; j< tab[i].length; j++) {
            
            tab[i][j] = i*j;
            System.out.print(tab[i][j]+ " ");
                
            }
            System.out.println();
        }
    }
}