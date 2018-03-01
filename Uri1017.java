/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1017;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int tmpV, vlM; double Res;
        tmpV = entrada.nextInt();
        vlM = entrada.nextInt();
        Res = (double)tmpV * vlM / 12;
        System.out.printf("%.3f\n",Res);
    }
    
}
