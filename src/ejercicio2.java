import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        String cadena = "";
        int divisor = 2;

        System.out.print("Introduce un número: ");
        int numero = read.nextInt();

        cadena = numero + " = ";

        while (numero != 1) {
            if (numero % divisor == 0) {
                cadena += divisor + " ";
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(cadena);
    }
}
