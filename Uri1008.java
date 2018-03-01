/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1008;

import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numF; int hrTrab; double vlporH; double slFinal;
        numF = entrada.nextInt();
        hrTrab = entrada.nextInt();
        vlporH = entrada.nextDouble();
        
        slFinal = (hrTrab * vlporH);
        System.out.println("NUMBER = " + numF);
        System.out.printf("SALARY = U$ %.2f\n", slFinal);
    }
    
}
