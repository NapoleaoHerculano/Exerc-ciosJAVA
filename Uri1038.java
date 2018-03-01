/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1038;
import java.util.Scanner;
/**
 *
 * @author Francivaldo Napoleão
 */
public class Uri1038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preco[] = {4.00,4.50,5.00,2.00,1.50};
        String pedidos[] = entrada.nextLine().split(" ");
        int pedido,quantidade;
        double valor;
        
        pedido = Integer.parseInt(pedidos[0]);
        quantidade = Integer.parseInt(pedidos[1]);
        valor = preco[pedido - 1] * quantidade;
        
        System.out.printf("Total: R$ %.2f\n", valor);
    }
    
}
