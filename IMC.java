import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = valor.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = valor.nextDouble();

        double imc = peso /(altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if ( imc < 18.5){
            System.out.println("Está abaixo do peso.");
        } else if ( imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if ( imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }
    }
}
