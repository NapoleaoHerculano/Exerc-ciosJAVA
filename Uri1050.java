/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1050;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int listaDDD[] = {61,71,11,21,32,19,27,31};
        String cidades[] = {"Brasilia","Salvador","Sao Paulo","Rio de Janeiro","Juiz de Fora","Campinas","Vitoria","Belo Horizonte"};
        int ddd = entrada.nextInt();
        String cidade = " ";
        for(int i = 0; i < listaDDD.length; i++){
            if(ddd == listaDDD[i]){
                cidade = cidades[i];
            }    
        }if(cidade != " "){
            System.out.println(cidade);
        }else{
            System.out.println("DDD nao cadastrado");
        }
    }
    
}
