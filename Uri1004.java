/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1004;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int produto = b * a;
        
        System.out.println("PROD = " + produto);
    }
    
}
