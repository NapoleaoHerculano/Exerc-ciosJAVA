/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1021;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();
        valor = valor + 0.001f;
        int cedulas[] = {100,50,20,10,5,2};
        double moedas[] = {1,0.50,0.25,0.10,0.05,0.01};
        System.out.println("NOTAS:");
        for(int i = 0; i < cedulas.length; i++){
            double ced = (int)valor / cedulas[i];
            valor = valor % cedulas[i];
            System.out.printf("%.0f nota(s) de R$ %d.00\n",ced,cedulas[i]);
        }
        System.out.println("MOEDAS:");
        for(int n = 0; n < moedas.length; n++){
            double moed = Math.floor(valor / moedas[n]);
            valor = valor % moedas[n];
            System.out.printf("%.0f moeda(s) de R$ %.2f\n",moed,moedas[n]);
        }
    }   
}
