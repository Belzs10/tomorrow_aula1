import java.util.Scanner;

public class Fatorial {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        int numero = scanner.nextInt();

        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}
