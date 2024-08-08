import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int number = 40;
        float number2 = 40.5f;
        char ch = 'A';

        System.out.println(number);
        System.out.println(number2);
        System.out.println(ch);

        Scanner nomeDoUsuario = new Scanner(System.in);
        System.out.println("Entre como nome");
        String nomePessoa = nomeDoUsuario.nextLine();
        System.out.println("O nome da pessoa:" + nomePessoa);
    }
}
