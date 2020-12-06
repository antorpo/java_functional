package collections._00_interfaces;

/*
    Interface Iterable<T>
    Implementing this interface allows an object to be the target of the "for-each loop" statement.

    Basicamente esta interfaz nos permite definir la clase que la implementa en un objeto
    el cual puede recorrerse en un bucle (forEach), implementando el metodo abstracto iterator()
    el cual contiene informacion del objeto siguiente que puede o no existir.
*/

import java.util.Iterator;

public class _00_Iterable {

    public static void main(String[] args) {
        tablaMultiplicar tabla = new tablaMultiplicar(5, 10);
        tablaMultiplicar tabla2 = new tablaMultiplicar(5, 10);

        /*
            La clase tablaMultiplicar implementa la interfaz Iterable,
            por consiguiente tendremos que implementar el metodo iterator()
            el cual retorna un objeto de tipo Iterator<T> que a su vez posee
            por dentro:
                .hasNext() -> Evalua cierta condicion para saber si podemos seguir iterando.
                .next() ->  Posee el valor siguiente de iterar.
        */
        for(int i : tabla){
           System.out.println(i);
        }

        System.out.println("EQUIVALENTE:");
        // Equivalente al forEach
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println(tabla2.iterator().next());
        System.out.println("Hay mas elementos: " + tabla2.iterator().hasNext());
        /*
            Podemos seguir utilizando tabla2.iterator().next() y seguir sacando valores
            pero seria saltar la logica del .hasNext() que hace nos indica hasta donde
            podemos llegar para no tener posibles errores de implementacion.
        */
    }
}

class tablaMultiplicar implements Iterable<Integer> {

    private int numero;
    private int size;
    private int posicion;

    public tablaMultiplicar(int numero, int size){
        this.numero = numero;
        this.size = size;
        posicion = 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        // Obtenemos el tamaño:
        int size = this.size;

        // Creamos el objeto iterator que puede tener o no un siguiente.
        Iterator<Integer> i = new Iterator<Integer>() {

            // Vamos a tener un siguiente si la posicion < size
            @Override
            public boolean hasNext() {

                if (posicion <= size) {
                    return true;
                }else {
                    return false;
                }

            }

            // El siguiente sera el numero elegido por la posicion.
            @Override
            public Integer next() {
                return numero*posicion++;
            }};

        // Devolvemos el iterator:
        return i;
    }
}