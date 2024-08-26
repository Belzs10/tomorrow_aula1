import java.util.ArrayList;

public class ArrayListInteiros {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();


        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);


        int soma = 0;
        for (int valor : lista) {
            soma += valor;
        }

        double media = (double) soma / lista.size();

        System.out.println("A média dos elementos é: " + media);
    }
}
