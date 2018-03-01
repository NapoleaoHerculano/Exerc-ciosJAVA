/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1007;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        
        int dif = (A * B - C * D);
        System.out.println("DIFERENCA = " + dif);
    }
    
}
