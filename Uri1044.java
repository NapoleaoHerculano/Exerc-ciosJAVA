/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1044;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1044 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputs[] = entrada.nextLine().split(" ");
        int a,b;
        a = Integer.parseInt(inputs[0]); b = Integer.parseInt(inputs[1]);
        if(b % a == 0 || a % b == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
    
}
