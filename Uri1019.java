/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1019;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tempo = entrada.nextInt();
        
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        
        while(tempo != 0){
            if(tempo >= 3600){
                horas += 1;
                tempo -= 3600;
            }else if(tempo >= 60){
                minutos += 1;
                tempo -= 60;
            }else if(tempo >= 1){
                segundos += 1;
                tempo -= 1;
            }
        }
        System.out.printf("%d:%d:%d\n",horas,minutos,segundos);
    }       
}
