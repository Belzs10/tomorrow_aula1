import java.util.LinkedList;

public class LinkedListInteiros {
    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();


        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);


        lista.add(2, 25);


        System.out.println("Lista após a inserção: " + lista);
    }
}
