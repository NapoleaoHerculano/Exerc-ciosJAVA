/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1036;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1036 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,delta,r1,r2;
        String lista[] = entrada.nextLine().split(" ");
        a = Double.parseDouble(lista[0]);b = Double.parseDouble(lista[1]);c = Double.parseDouble(lista[2]);
        
        delta = (Math.pow(b, 2)) - (4 * a * c);
        r1 = (-b + (Math.sqrt(delta))) / (2 * a);
        r2 = (-b - (Math.sqrt(delta))) / (2 * a);
        
        if(2 * a > 0 && delta > 0){
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }else{
            System.out.println("Impossivel calcular");
        }
        
    }
    
}
