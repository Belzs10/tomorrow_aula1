import java.util.HashMap;
import java.util.Map;

public class HashMapChaveValor {
    public static void main(String[] args) {

        HashMap<String, String> MarcasCarros = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap
        MarcasCarros.put("Toyota", "Japonesa");
        MarcasCarros.put("Ford", "Americana");
        MarcasCarros.put("BMW", "Alemã");
        MarcasCarros.put("Fiat", "Italiana");
        MarcasCarros.put("Renault", "Francesa");

        for (Map.Entry<String, String> entry : MarcasCarros.entrySet()) {
            System.out.println("Marca: " + entry.getKey() + " - Nacionalidade: " + entry.getValue());
        }
    }
}
