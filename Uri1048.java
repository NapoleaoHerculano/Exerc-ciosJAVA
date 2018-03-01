package uri1048;
import java.util.Scanner;

public class Uri1048 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarios[][] = {{0,400,0.15},{400.01,800,0.12},{800.01,1200,0.10},{1200.01,2000,0.07}};
        double pag = entrada.nextDouble();
        double novoS = 0, reaj = 0, percentual = 0;
        
        for(int i = 0; i < salarios.length; i++){
            if(pag >= salarios[i][0] && pag <= salarios[i][1]){
                reaj = (pag * salarios[i][2]);
                novoS = pag + reaj;
                percentual = salarios[i][2] * 100;
            }else if(pag > 2000){
                reaj = (pag * 0.04);
                novoS = pag + reaj;
                percentual = 0.04 * 100;
            }
        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %s\n", novoS,reaj,percentual,"%");   
    }
}
