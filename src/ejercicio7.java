import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String cadena;
        String buscar;
        ArrayList<String> cadenas = new ArrayList<>();

        do {
            System.out.print("Introduce una cadena de texto, si quieres salir del bucle, introduce 'fin': ");
            cadena = read.nextLine();
            cadenas.add(cadena);
        } while (!Objects.equals(cadena, "fin"));

        do {
            System.out.print("Introduce una cadena de texto para buscarla, si quieres salir del bucle, introduce 'fin': ");
            buscar = read.nextLine();
            if (cadenas.contains(buscar)) {
                System.out.println("La cadena está en la lista");
            } else {
                System.out.println("La cadena no está en la lista");
            }
        } while (!Objects.equals(buscar, "fin"));
    }
}
