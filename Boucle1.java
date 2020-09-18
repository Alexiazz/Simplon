import java.util.Scanner;

public class Boucle1 {

 
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez une valeur numerique");
        int num = sc.nextInt();

       for (var i = num;  i >=0 ; --i){

        System.out.println("La valeur numerique est :" + i);
         
       } 
      
    }
    

}