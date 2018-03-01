/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1015;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lista1[]= entrada.nextLine().split(" ");
        String lista2[]= entrada.nextLine().split(" ");
        double x1,y1,x2,y2; double dist; double a,b; double p1,p2;
        x1 = Double.parseDouble(lista1[0]);
        y1 = Double.parseDouble(lista1[1]);
        x2 = Double.parseDouble(lista2[0]);
        y2 = Double.parseDouble(lista2[1]);
        
        a = (x2 - x1);
        b = (y2 - y1);
        
        p1 = Math.pow(a, 2);
        p2 = Math.pow(b, 2);
        
        dist = p1 + p2;
        double raiz = Math.sqrt(dist);
        System.out.printf("%.4f\n",raiz);
   
    }
    
}
