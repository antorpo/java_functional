package collections._00_interfaces;
import java.util.*;

/*
    Interface List<E>
    public interface List<E> extends Collection<E>

    Interface Set<E>
    public interface Set<E> extends Collection<E>

    Ambas interfaces heredan de Collection<E> pero cambian con respecto al enfoque que tienen
    es decir, ambas interfaces tendran nuevos metodos que separaran en dos grandes grupos
    las diferentes colecciones que las implementen, en este caso:

    List -> Colecciones ordenadas (conocidas como secuencias), se podran acceder a los elementos de
    estas mediante un index, permitira tener elementos repetidos, nulos, etc.

    Por lo tanto esta interfaz tendra nuevos metodos abstractos relacionados con el index y demas.
    Colecciones como Vector, ArrayList, LinkedList implementan esta interfaz.


    Set -> Colecciones que no contienen elementos duplicados y a lo mucho un elemento nulos, los elementos
    estan ordenados. Colecciones como  HashSet, TreeSet, LinkedHashSet implementan esta interfaz.

    Si comparamos la Interfaz Set con Collection podemos ver que practicamente no agrega nada,
    salvo que define que no podemos tener elementos repetidos.


*/

public class _00_List_And_Set {

    public static void main(String[] args) {
        List<Integer> listA = new ListExample();
        Set<Integer> setA = new SetExample();

        // No poseen implementacion:
        listA.add(3);
        setA.add(4);
    }


}


class ListExample implements List<Integer> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
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
    public boolean add(Integer integer) {
        return false;
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
    public boolean addAll(int index, Collection<? extends Integer> c) {
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
    public void clear() {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}


class SetExample implements Set<Integer> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
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
    public boolean add(Integer integer) {
        return false;
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
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}