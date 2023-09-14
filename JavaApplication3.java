
package javaapplication3;
import java.util.Scanner;


public class JavaApplication3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(), cont=0;
        
        while (cont < x) {
            
            if(cont % 2 != 0) {
                System.out.println(cont);
            }
                    
            cont++;
        }
        
    }
    
}
