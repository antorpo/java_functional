package collections._00_interfaces;
import java.util.Collection;
import java.util.Iterator;

/*
    public interface Collection<E> extends Iterable<E>

    Collection es una interfaz que extiende de Iterable y por ende posee la misma definicion
    de los objetos iterables, solo que ahora trae sus propias firmas de metodos que contienen las operaciones
    basicas para manejar una colecccion (Las colecciones representan grupos de objetos, denominados elementos):
        - Agregar, borrar, iterar, buscar.
*/

public class _00_Collection {

    public static void main(String[] args) {
        Collection<Integer> enteros = new coleccionEnteros(10);
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);
        enteros.add(7);
        enteros.add(8);
        enteros.add(9);
        enteros.add(10);

        /*
            Como Collection<E> hereda de Iterable<E> tenemos
            el .iterator() que nos va a permitir utilizar el
            forEach.
        */
        for (int i : enteros){
            System.out.println(i);
        }

        /*
            Utilizamos el .forEach() que recibe un Consumer expresado como un lambda pero en este
            caso utilizando el operador de referencia
        */
        enteros.forEach(System.out::println);

    }

}

class coleccionEnteros implements Collection<Integer>{
    private int arr[];
    private int size;
    private int pos;
    private int posA;


    public coleccionEnteros(int size){
        arr = new int[size];
        this.size = size;
        this.pos = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> i = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {

                if(posA < size){
                    return true;
                }

                posA = 0;
                return false;
            }

            @Override
            public Integer next() {
                return arr[posA++];
            }
        };

        return i;
    }

    @Override
    public boolean add(Integer integer) {
        arr[pos] = integer;
        pos++;

        return true;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {}
}


