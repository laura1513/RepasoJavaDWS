package ejercicio8;

public class Main {
    public static void main(String[] args) {
        ListaDeDatos lista = new ListaDeDatos();
        String cadena = "";
        String buscar = "";
        lista.incluir(cadena);
        System.out.println("Se ha creado una lista");
        lista.contiene(buscar);
        lista.mostrarDatosOrdenados();
    }
}
