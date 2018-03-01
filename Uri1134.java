/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1134;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        int tipo = 0;
        while(tipo != 4){
            tipo = entrada.nextInt();
            if(tipo == 1){
                alcool += 1;
            }else if(tipo == 2){
                gasolina += 1;
            }else if(tipo == 3){
                diesel += 1;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
    
}
