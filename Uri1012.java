/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1012;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String lista[] = entrada.nextLine().split(" ");
       double a,b,c;
       a = Double.parseDouble(lista[0]);
       b = Double.parseDouble(lista[1]);
       c = Double.parseDouble(lista[2]);
       
       double triangulo,circulo,trapezio,quadrado,retangulo;
       triangulo = (a * c)/2;
       double c2 = Math.pow(c, 2);
       circulo = 3.14159 * c2;
       trapezio = c * (a + b) / 2;
       quadrado = b * b;
       retangulo = a * b;
       
       System.out.printf("TRIANGULO: %.3f\n", triangulo);
       System.out.printf("CIRCULO: %.3f\n", circulo);
       System.out.printf("TRAPEZIO: %.3f\n", trapezio);
       System.out.printf("QUADRADO: %.3f\n", quadrado);
       System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
    
}
