/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1005;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
    
}
