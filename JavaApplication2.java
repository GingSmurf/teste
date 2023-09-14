
package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int alcol=0, diesel=0, gasolina=0;
        
        while (x != 4) {
            if (x == 1) {
                alcol += 1;
            }
            else if (x == 2) {
                gasolina += 1;
            }
            else if (x == 3) {
                diesel += 1;
            }
            x = sc.nextInt();
        }
        
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool = " + alcol);
        System.out.println("Galosina = " + gasolina);
        System.out.println("Diesel = " + diesel);

        
        sc.close();
    }
    
}
