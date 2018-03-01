/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1014;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X; double Y; double consumo;
        X = entrada.nextInt();
        Y = entrada.nextDouble();
        
        consumo = X / Y;
        
        System.out.printf("%.3f km/l\n",consumo);
    }
    
}
