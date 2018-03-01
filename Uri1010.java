/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1010;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lista[] = entrada.nextLine().split(" ");
        String lista2[] = entrada.nextLine().split(" ");
        double vlFinal;
        //Variáveis
        //1º Linha
        int numPc = Integer.parseInt(lista[1]);
        double vlUni = Double.parseDouble(lista[2]);
        //2ºLinha
        int numPc2 = Integer.parseInt(lista2[1]);
        double vlUni2 = Double.parseDouble(lista2[2]);
        
        vlFinal = (numPc * vlUni) + (numPc2 * vlUni2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", vlFinal);
    }
    
}
