/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1041;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lista[] = entrada.nextLine().split(" ");
        double x,y;
        x = Double.parseDouble(lista[0]); y = Double.parseDouble(lista[1]);
        if(x == 0 && y == 0){
            System.out.println("Origem");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else if(y > 0 || y < 0 && x == 0){
            System.out.println("Eixo Y");
        }else if(x > 0 || x < 0 && y == 0){
            System.out.println("Eixo X");
        }
    }
}
