package ejercicio8;

import java.util.*;

public class ListaDeDatos {
    Scanner read = new Scanner(System.in);
    ArrayList<String> cadenas = new ArrayList<>();
    public void incluir(String cadena) {
        do {
            System.out.print("Introduce una cadena de texto, si quieres salir del bucle, introduce 'fin': ");
            cadena = read.nextLine();
            cadenas.add(cadena);
        } while (!Objects.equals(cadena, "fin"));
    }
    public boolean contiene(String buscar) {
        boolean ok;
        do {
            System.out.print("Introduce una cadena de texto para buscarla, si quieres salir del bucle, introduce 'fin': ");
            buscar = read.nextLine();
            if (cadenas.contains(buscar)) {
                ok = true;
                System.out.println("La cadena está en la lista");
            } else {
                ok = false;
                System.out.println("La cadena no está en la lista");
            }
        } while (!Objects.equals(buscar, "fin"));
        return ok;
    }
    public void mostrarDatosOrdenados() {
        Collections.sort(cadenas);
        System.out.println(cadenas);
    }
}
