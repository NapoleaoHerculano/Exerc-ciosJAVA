/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1040;
import java.util.Scanner;

/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String notas[] = entrada.nextLine().split(" ");
        float e1,e2,e3,e4,n1,n2,n3,n4,media,exame,mediaf;
        //Entradas
        e1 = Float.parseFloat(notas[0]);e2 = Float.parseFloat(notas[1]);
        e3 = Float.parseFloat(notas[2]);e4 = Float.parseFloat(notas[3]);
        //Notas com peso
        n1 = (e1 * 2);n2 = (e2 * 3);n3 = (e3 * 4); n4 = (e4 * 1);
        //Media
        media = (n1+n2+n3+n4)/10;
        if(media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }else if(media >= 5 && media <= 6.9){
            String n_ex[] = entrada.nextLine().split(" ");
            exame = Float.parseFloat(n_ex[0]);
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", exame);
            mediaf = (media + exame)/2;
            if(mediaf >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaf);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final %.1f\n", mediaf);
            }
        }else{
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }   
    }    
}
