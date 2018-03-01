/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1042;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputs[] = entrada.nextLine().split(" ");
        int a,b,c;
        a = Integer.parseInt(inputs[0]);b = Integer.parseInt(inputs[1]);c = Integer.parseInt(inputs[2]);
        int lista[] = {a,b,c};
        Arrays.sort(lista);
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        System.out.println();
        for(int n = 0; n < inputs.length; n++){
            System.out.println(inputs[n]);
        }
    }
    
}
