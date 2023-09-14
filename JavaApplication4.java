
package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), x;
        int dentro=0, fora=0;
        
        while (N != 0) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                dentro++;
            }
            else {
                fora++;
            }
            N--;
        }
        System.out.printf("%d in \n", dentro);
        System.out.printf("%d out \n", fora);
        
        sc.close();
    }
    
}
