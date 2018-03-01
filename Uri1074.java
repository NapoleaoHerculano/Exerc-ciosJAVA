/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1074;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int cont = 0;
        while (cont < N){
            int valor = entrada.nextInt();
            if(valor % 2 == 0 && valor > 0){
                System.out.println("EVEN POSITIVE");
            }else if(valor % 2 == 0 && valor < 0){
                System.out.println("EVEN NEGATIVE");   
            }else if(valor %2 != 0 && valor > 0){
                System.out.println("ODD POSITIVE");
            }else if(valor % 2 != 0 && valor < 0){
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
            cont++;
        }
        
    }
    
}
