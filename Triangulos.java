import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();


        if (isTriangulo(lado1, lado2, lado3)) {

            String tipo = classificarTriangulo(lado1, lado2, lado3);
            System.out.println("O triângulo é " + tipo + ".");
        } else {
            System.out.println("Os comprimentos fornecidos não formam um triângulo válido.");
        }

        scanner.close();
    }


    public static boolean isTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }


    public static String classificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }

    }
}
