import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce un número y te diré si es primo y palindromo ");
        int numero = read.nextInt();
        if (esPalindromo(numero) && esPrimo(numero)) {
            System.out.println("Es palindromo y primo");
        } else {
            System.out.println("No es palindromo y primo");
        }
        //Ejemplos de números palindromos y primos: 101, 131, 151, 313
    }
    public static boolean esPalindromo(int num) {
        boolean ok;
        int n = num;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (num == rev) {
            ok = true;
        } else {
            ok = false;
        }
        return ok;
    }
    public static boolean esPrimo (int num) {
        boolean ok = true;
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
