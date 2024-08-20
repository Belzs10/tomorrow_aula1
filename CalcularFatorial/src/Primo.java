import java.util.Scanner;

public class Primo {
    // Função que verifica se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        // Verifica se o número tem divisores além de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível por i, não é primo
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        boolean resultado = ehPrimo(numero);
        System.out.println("O número " + numero + " é primo? " + resultado);
    }
}
