import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       LinkedList<String> object  = new LinkedList<>();
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");

        System.out.println("Linked list : " + object);
        object.removeLast();
        object.get(6);
        System.out.println("Linked list : " + object);

    }
}
