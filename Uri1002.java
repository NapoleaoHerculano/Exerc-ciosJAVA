package uri1002;
import java.util.Scanner;

public class Uri1002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi = 3.14159;
        double raio = entrada.nextDouble();
        double area = pi * (raio*raio);
        System.out.printf("A=%.4f\n", area);
    }
    
}
