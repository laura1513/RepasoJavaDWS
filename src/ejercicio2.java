import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número mayor que '1': ");
            numero = read.nextInt();
        } while (numero < 1);
        System.out.print(numero + "=");
        factorizarPrimo(numero);
    }
    public static void factorizarPrimo(int numero) {
        int divisor = 2;
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.print(divisor);
                numero = numero / divisor;
                if (numero > 1) {
                    System.out.print("*");
                }
            } else {
                divisor++;
            }
        }
    }
}
