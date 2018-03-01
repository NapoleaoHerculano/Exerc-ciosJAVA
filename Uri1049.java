/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1049;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1049 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cond1,cond2,cond3;
        cond1 = entrada.nextLine();cond2 = entrada.nextLine();cond3 = entrada.nextLine();
        
        if(cond1.equalsIgnoreCase("vertebrado")){
            if(cond2.equalsIgnoreCase("ave") && cond3.equalsIgnoreCase("carnivoro")){
                System.out.println("aguia");
            }else if(cond2.equalsIgnoreCase("ave") && cond3.equalsIgnoreCase("onivoro")){
                System.out.println("pomba");
            }else if(cond2.equalsIgnoreCase("mamifero") && cond3.equalsIgnoreCase("onivoro")){
                System.out.println("homem");
            }else if(cond2.equalsIgnoreCase("mamifero") && cond3.equalsIgnoreCase("herbivoro")){
                System.out.println("vaca");
            }
        }else if(cond1.equalsIgnoreCase("invertebrado")){
            if(cond2.equalsIgnoreCase("inseto") && cond3.equalsIgnoreCase("hematofago")){
                System.out.println("pulga");
            }else if(cond2.equalsIgnoreCase("inseto") && cond3.equalsIgnoreCase("herbivoro")){
                System.out.println("lagarta");
            }else if(cond2.equalsIgnoreCase("anelideo") && cond3.equalsIgnoreCase("hematofago")){
                System.out.println("sanguessuga");
            }else if(cond2.equalsIgnoreCase("anelideo") && cond3.equalsIgnoreCase("onivoro")){
                System.out.println("minhoca");
            }   
        }    
    }
}
