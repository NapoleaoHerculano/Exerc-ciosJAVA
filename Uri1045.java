/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1045;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1045 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double inputs[] = {entrada.nextDouble(), entrada.nextDouble(),entrada.nextDouble()};
        Arrays.sort(inputs);
        double a,b,c;
        a = inputs[2];b = inputs[1];c = inputs[0];
        if(a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if((Math.pow(a, 2)) == (b * b + c * c)){
                System.out.println("TRIANGULO RETANGULO");
            }if((Math.pow(a, 2)) > (b * b + c * c)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }if((Math.pow(a ,2)) < (b * b + c * c)){
                System.out.println("TRIANGULO ACUTANGULO");
            }if(a == b && a == c && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b || b == c || a == c){
                System.out.println("TRIANGULO ISOSCELES");
            }    
        }
    }
}
