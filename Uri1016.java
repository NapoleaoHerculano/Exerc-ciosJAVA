/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1016;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X, Res;
        X = entrada.nextInt();
        Res = X * 2;
        System.out.printf("%d minutos\n",Res);
    }
    
}
