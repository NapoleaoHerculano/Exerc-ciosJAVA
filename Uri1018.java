/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1018;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int lista[] = {100,50,20,10,5,2,1};
        System.out.println(N);
        for(int i = 0; i < lista.length; i++){
            int ced =(int) N / lista[i];
            N = N % lista[i];
            System.out.printf("%d nota(s) de R$ %d,00\n",ced,lista[i]);
        }
    }
    
}
