/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1051;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double renda[] = {0.08,0.18,0.28};
        double salario = entrada.nextDouble();
        
        double resto = 0;
        
        if(salario <= 2000){
                System.out.println("Isento"); 
        }else{
            salario -= 2000;
            for(int i = 0; i < renda.length; i++){
                resto = salario % 1000;
                
            }
        }
    }
    
}
