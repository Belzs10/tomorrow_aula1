import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade: ");

        int idadeDoUsuario = entrada.nextInt();

        if (idadeDoUsuario >= 0 && idadeDoUsuario <= 12) {
            System.out.println("O usuário do sistema é uma criança.");
        } else if (idadeDoUsuario >= 13 && idadeDoUsuario <=17) {
            System.out.println("O usuário do sistema é um adolescente.");
        } else if (idadeDoUsuario >= 18 && idadeDoUsuario <= 64) {
            System.out.println("O usuário do sistema é adulto.");
        } else if (idadeDoUsuario >= 65) {
            System.out.println("O usuário do sistema é idoso.");
        } else {
            System.out.println("Idade inválida!");
    }
        System.out.println("Entre com o ano; ");
        int ano = entrada.nextInt();


        /* um ano bissexto pode ser divisível por 4, mas não pode por 100, exceto se for divisível por 400.
         */

          ano = 2023;


          if ((ano % 4 == 0 & ano % 100 != 0) || ano % 400 == 0) {
              System.out.println("Ano bissexto.");
          } else {
              System.out.println("Não é an0 bissexto.");

          }

        }
        }


