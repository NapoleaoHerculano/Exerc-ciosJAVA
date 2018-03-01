/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1020;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tempo = entrada.nextInt();
        
        int ano = 0;
        int mes = 0;
        int dia = 0;
        
        while(tempo != 0){
            if(tempo >= 365){
                ano += 1;
                tempo -= 365;
            }else if(tempo >= 30){
                mes += 1;
                tempo -= 30;
            }else if(tempo >= 1){
                dia += 1;
                tempo -= 1;
            }
        }
        System.out.printf("%d ano(s)\n",ano);
        System.out.printf("%d mes(es)\n",mes);
        System.out.printf("%d dia(s)\n",dia);
    }
    
}
