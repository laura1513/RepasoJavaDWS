import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 12: ");
        int mes = read.nextInt();

        switch (mes) {
            case 1:
                System.out.println("enero"); break;
            case 2:
                System.out.println("febrero"); break;
            case 3:
                System.out.println("marzo"); break;
            case 4:
                System.out.println("abril"); break;
            case 5:
                System.out.println("mayo"); break;
            case 6:
                System.out.println("junio"); break;
            case 7:
                System.out.println("julio"); break;
            case 8:
                System.out.println("agosto"); break;
            case 9:
                System.out.println("septiempre"); break;
            case 10:
                System.out.println("octubre"); break;
            case 11:
                System.out.println("noviembre"); break;
            case 12:
                System.out.println("diciembre"); break;
            default:
                System.out.println("El mes no existe"); break;
        }
    }
}
