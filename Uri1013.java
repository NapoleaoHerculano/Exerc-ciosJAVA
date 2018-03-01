/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1013;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lista[] = entrada.nextLine().split(" ");
        int a,b,c;
        a = Integer.parseInt(lista[0]);
        b = Integer.parseInt(lista[1]);
        c = Integer.parseInt(lista[2]);
        
        if(a > b && a > c){
            System.out.printf("%d eh o maior\n",a);
        }else if(b > c){
            System.out.printf("%d eh o maior\n",b);
        }else{
            System.out.printf("%d eh o maior\n",c);
        }
    }
    
}
