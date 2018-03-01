/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1002;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi = 3.14159;
        double raio = entrada.nextDouble();
        double area = pi * (raio*raio);
        System.out.printf("A=%.4f\n", area);
    }
    
}
