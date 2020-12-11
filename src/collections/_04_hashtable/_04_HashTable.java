package collections._04_hashtable;
import java.util.Hashtable;
import java.util.Iterator;

/*
    public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable

    Constructor: Hashtable(int initialCapacity, float loadFactor)
    An instance of Hashtable has two parameters that affect its performance: initial capacity and load factor.
    The capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at
    the time the hash table is created. Note that the hash table is open: in the case of a "hash collision", a
    single bucket stores multiple entries, which must be searched sequentially. The load factor is a measure of
     how full the hash table is allowed to get before its capacity is automatically increased.

    HashTable -> Esta coleccion es muy similar al HashMap con algunas diferencias, HashTable es sincronizada pero
    HashMap no, tampoco permite valores nulos como clave o valor.

    Las tablas de dispersion se podria decir que combinan conceptos de estructuras que usan punteros y que usan index
    para sus elementos, esto es muy util ya ambas funcionalidades se complementan para tener un mejor desempeño
    y menor complejidad cuando queremos trabajar con los elementos.

    Los elementos se almacenan en espacios conocidos como slots/buckets, la funcion hash se encargara de asignar un
    index a los elementos por medio de su clave, la funcion hash que elijamos influira mucho en el coste para acceder
    a los elementos ya que ciertas funciones hash tienen mas riesgo de colision que otras.
    
    Hash(key) -> index
    factor de carga: Elementos insertados/Total de slots

    Para minimizar el riesgo de colision se recomienda que el factor de carga no sea muy alto (>75%),
    por eso una de las ventajas que poseen las tablas de dispersion es el coste de ciertas operaciones como
    inserccion, busqueda incluso eliminacion que se realizan en tiempo costante O(1), como principal desventaja
    tenemos que para evitar las colisiones se recomienda que M >> N, donde M  es el numero de slots y N el numero
    de elementos a insertar para que el factor de carga no sea muy alto, pudiendo consumir bastante en memoria.

    Se debe tener en cuenta que los datos almacenados en una tabla hash no se guardan ordenados, esto depende de la
    funcion hash, por lo tanto operaciones que impliquen a acceso a datos ordenados implica mayor coste temporal.

    Por ejemplo: Como las claves pasan por una funcion hash que devuelve el index donde esta el elemento, para
    buscar un elemento en un tabla de dispersion el coste sera constante O(1), siempre y cuando no existan colisiones,
    en caso de que existan el coste puede variar dependiendo de la resolucion a las colisiones, casi siempre
    se utilizan las listas enlazadas.

    Hashtable Constructors:
    - Hashtable(): It is the default constructor. It constructs a new, empty hashtable with a default initial
      capacity (11) and load factor (0.75).

    - Hashtable(int size): It constructs a new, empty hashtable of specified initial size.

    >> HashMap es una coleccion mas rapida que HashTable ya que no es sincronizada.
    >> HashTable esta obsoleto desde Java 1.7 se recomienda utilizar otras colecciones como HashMap,
    ConcurrentHashMap, LinkedHashMap, etc.



*/

public class _04_HashTable {

    public static void main(String[] args) {
        //1. Create Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        //2. Add mappings to hashtable
        hashtable.put(1,  "A");
        hashtable.put(2,  "B" );
        hashtable.put(3,  "C");

        System.out.println(hashtable);

        //3. Get a mapping by key
        String value = hashtable.get(1);        //A
        System.out.println(value);

        //4. Remove a mapping
        hashtable.remove(3);            // (3, C) is deleted

        //5. Iterate over mappings
        for (Integer key : hashtable.keySet()) {
            String mappedValue = hashtable.get(key);

            System.out.println("Key: " + key + ", Value: " + mappedValue);
        }
    }

}
