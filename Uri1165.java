/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1165;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1165 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int executar = entrada.nextInt();
       for(int i = 0; i < executar; i++){
           int num = entrada.nextInt();
           if(num % 2 != 0 && num % 3 != 0){
               System.out.printf("%d eh primo\n",num);
           }else{
               System.out.printf("%d nao eh primo\n",num);
           }
       }
    }
    
}
