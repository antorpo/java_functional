package collections._00_interfaces;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/*
    Interface Queue<E>
    public interface Queue<E> extends Collection<E>

    Queue -> Es una interfaz que hereda de Collection<E> y hace referencia a Colecciones
    donde existe prioridad a la hora de procesar los elementos, en este caso
    FIFO (First In First Out), ademas de los metodos de Collection<E> posee adicionalmente:
        .poll(), .peek(), .offer()
    Los cuales son exclusivo de este tipo de colecciones debido a su comportamiento natural.
    Colecciones como PriorityQueue implementan esta interfaz.

    Interface Deque<E>
    public interface Deque<E> extends Queue<E>

    Deque -> Es una interfaz que hereda de Queue<E>, la diferencia con esta es que es
    una (Cola de doble finalizacion) es decir que se pueden agregar elementos tanto en
    la parte delantera y trasera de la cola, para este proceso incluye adicionalmente
    metodos como:
        .getFirst(), .getLast(), .addFirst(), .addLast(), .removeFirst(), .removeLast()
    Colecciones como LinkedList, ArrayDeque tambien implementan esta interfaz.

*/

public class _00_Queue_And_Deque {

    public static void main(String[] args) {
        Queue<Integer> queueA = new QueueExample();
        Deque<Integer> dequeA = new DequeExample();

        // No implementados:
        queueA.add(10);
        queueA.poll();

        /*
            Comparando con una cola normal, ya no solo podemos insertar
            al final si no que tambien al inicio.
        */
        dequeA.addFirst(1);
        dequeA.addLast(10);
    }
}

class QueueExample implements Queue<Integer> {

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
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }
}


class DequeExample implements Deque<Integer> {

    @Override
    public void addFirst(Integer integer) {

    }

    @Override
    public void addLast(Integer integer) {

    }

    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }

    @Override
    public Integer removeFirst() {
        return null;
    }

    @Override
    public Integer removeLast() {
        return null;
    }

    @Override
    public Integer pollFirst() {
        return null;
    }

    @Override
    public Integer pollLast() {
        return null;
    }

    @Override
    public Integer getFirst() {
        return null;
    }

    @Override
    public Integer getLast() {
        return null;
    }

    @Override
    public Integer peekFirst() {
        return null;
    }

    @Override
    public Integer peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public void push(Integer integer) {

    }

    @Override
    public Integer pop() {
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
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
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
    public Iterator<Integer> descendingIterator() {
        return null;
    }
}
