import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce un número y te diré si es primo y palindromo");
        int numero = read.nextInt();
        esPalindromo(numero);
        if (esPalindromo(numero)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("no lo es");
        }
    }
    public static boolean esPalindromo(int n) {
        boolean ok = false;
        //Almacenará el numero al revés
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if (n == rev) {
            ok = true;
        }
        return ok;
    }
}
