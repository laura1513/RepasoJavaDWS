import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("Dime tu  nombre: ");
        String nombre = read.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola, " + nombre);
        }
    }
}
