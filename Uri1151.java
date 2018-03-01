/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1151;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1151 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = entrada.nextInt();
        System.out.printf("%d       %d", a,b);
        for(int i = 2; i < n; i++){
            int fibo = a + b;
            a = b;
            b = fibo;
            System.out.printf("\t" + fibo);
        }
        System.out.println();
        
    }
    
}
