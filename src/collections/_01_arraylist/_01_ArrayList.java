package collections._01_arraylist;
import java.util.*;

/*
    public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

    Es la implementacion de un arreglo redimensionable posee las siguientes caractisticas:
     - Ordenada, Indexada, Redimension Dinamica, No Sincronizada, Permite duplicados.


*/

public class _01_ArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getList(1,2,3,4,5,6,7,8,9,10);

        // Agregamos el elemento 11 al final del array:
        arrayList.add(11);

        // Obtenemos el elemento de la posicion cero:
        int element = arrayList.get(0);

        // Recorremos el arraylist con el foreach, el cual en el fondo utiliza el .iterator() de Iterable
        // y tambien recibe como parametro un Consumer<E> el pasamos con operador de referencia
        arrayList.forEach(System.out::println);

        // Buscamos el index donde se aloja el elemento enviado por parametro
        arrayList.indexOf(5);
    }

    public static <T> ArrayList<T> getList(T... elements){
        return (ArrayList<T>) Arrays.asList(elements);
    }

}



