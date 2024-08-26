import java.util.HashSet;

public class HashSetStrings {
    public static void main(String[] args) {

        HashSet<String> palavras = new HashSet<>();

        palavras.add("maçã");
        palavras.add("banana");
        palavras.add("laranja");
        palavras.add("uva");


        String Verificar = "banana";


        if (palavras.contains(Verificar)) {
            System.out.println("O HashSet contém a palavra: " + Verificar);
        } else {
            System.out.println("O HashSet não contém a palavra: " + Verificar);
        }
    }
}
