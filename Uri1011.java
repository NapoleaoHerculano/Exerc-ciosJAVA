/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1011;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double raio; double raio3; double pi = 3.14159; double volume;
        raio = entrada.nextDouble();
        raio3 = Math.pow(raio,3);
        volume = (4/3.0) * pi * raio3;
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
    }
    
}
