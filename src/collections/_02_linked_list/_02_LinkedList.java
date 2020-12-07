package collections._02_linked_list;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/*
    public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable

    -> LinkedList: Una lista enlazada es una colección o secuencia de elementos dispuestos uno detrás de otro,
    en la que cada elemento se conecta al siguiente elemento por un “enlace” o “referencia”. En este caso
    sera una lista doblemente ligada.

    Al implementar List<E> podremos tener elementos repetidos, nulos y podremos insertar en un determinado index,
    y al implementar Deque<E> podremos insertar al inicio y final de la lista.

    Caracteristicas:
        - Ligada doblemente, funciona como Queue (Cola) y como Stack (Pila).
        - Permite elementos duplicados y nulos.
        - No Sincronizada.
        - No implementa la interfaz RandomAccess, solo podremos obtener elementos en orden secuencial.

*/

public class _02_LinkedList {

    public static void main(String[] args) {
        //Create linked list
        LinkedList<String> linkedList = new LinkedList<>();

        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println(linkedList);

        //Add elements at specified position
        linkedList.add(4, "A");
        linkedList.add(5, "A");

        System.out.println(linkedList);

        //Remove element
        linkedList.remove("A");     //removes A
        linkedList.remove(0);       //removes B

        System.out.println(linkedList);

        //Iterate
        linkedList.forEach(System.out::println);
        ListIterator<String> iterator = linkedList.listIterator();

        // Equivalente al forEach
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Sort the list
        Collections.sort(linkedList);

        // Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());
    }


}
