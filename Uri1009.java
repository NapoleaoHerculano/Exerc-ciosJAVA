/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1009;
import java.util.Scanner;


/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String vendedor; double slFixo; double vendasMes; double slFinal;
        vendedor = entrada.next();
        slFixo = entrada.nextDouble();
        vendasMes = entrada.nextDouble();
        
        slFinal = slFixo + (vendasMes * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", slFinal);
        
    }
    
}
