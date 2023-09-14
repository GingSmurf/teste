
package javaapplication6;
import java.util.Locale;
import java.util.Scanner;

public class JavaApplication6 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int x, y;
   
        while (N!=0) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (y == 0) {
                System.out.println("Divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f \n", div);
            }
            
            N--;
        }
        
        sc.close();
    }
    
}
