/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1043;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputs[] = entrada.nextLine().split(" ");
        double a,b,c,perimetro,area;
        a = Double.parseDouble(inputs[0]);b = Double.parseDouble(inputs[1]);c = Double.parseDouble(inputs[2]);
        
        if((b - c) < a && a < (b + c) && (a - c) < b && b < (a + c) && (a - b) < c && c < (a +b)){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            area = (a + b) * c / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
    
}
