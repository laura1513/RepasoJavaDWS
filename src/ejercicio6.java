import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int buscar;
        ArrayList<Integer> numeros = new ArrayList<>();

        do {
            System.out.print("Introduce un número, si quieres salir del bucle, introduce un número negativo: ");
            num = read.nextInt();
            numeros.add(num);
        } while (num >= 0);

        do {
            System.out.print("Introduce un número para buscarlo, si quieres salir del bucle, introduce un número negativo: ");
            buscar = read.nextInt();
            if (numeros.contains(buscar)) {
                System.out.println("El número está en la lista");
            } else {
                System.out.println("El número no está en la lista");
            }
        } while (buscar >= 0);
    }
}
