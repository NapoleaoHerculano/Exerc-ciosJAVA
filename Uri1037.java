/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1037;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1037 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int intervalos[][] = {{0,25},{25,50},{50,75},{75,100}};
         double num = entrada.nextDouble();
         for(int i = 0; i < intervalos.length; i++){
             if(num >= intervalos [i][0] && num <= intervalos [i][1] && i == 0){
                 System.out.printf("Intervalo [%d,%d]\n", intervalos[i][0],intervalos[i][1]);
                 break;
             }else if(num > intervalos[i][0] && num <= intervalos[i][1]){
                 System.out.printf("Intervalo (%d,%d]\n", intervalos[i][0],intervalos[i][1]);
                 break;
             }
             else{
                 if(i == 3){
                     System.out.println("Fora de intervalo");
                 }
             }
         }
    }
    
}
