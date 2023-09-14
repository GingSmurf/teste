
package javaapplication5;
import java.util.Scanner;
import java.util.Locale;

public class JavaApplication5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double v1=0;
        double x1, x2, x3;
        
        while (N!=0) {
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();
            
            v1 = (x1 *2.0 + x2 * 3.0 + x3 * 5.0) / 10.0 ;
            
            System.out.printf("%.1f \n", v1);
                    
            N--;
        }
        sc.close();
    }
    
}
