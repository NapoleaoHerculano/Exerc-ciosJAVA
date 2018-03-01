/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1046;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1046 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lista[] = {entrada.nextInt(), entrada.nextInt()};
        int a, b; a = lista[0]; b = lista[1];
        int duracao = 0;
        
        if(a > b || a == b){
            duracao = 24 - a + b;
        }else{
            duracao = b - a;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",duracao);
        
    }
    
}
