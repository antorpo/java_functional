package collections._03_hashmap;
import java.util.HashMap;
import java.util.Iterator;

/*
    public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

    HashMap -> Se usa para almacenar elementos por parejas clave-valor como si se tratara de un diccionario,
    donde a cada clave le corresponde un unico valor, las claves duplicadas no son permitidas.

    Caracteristicas:
        - No contiene claves duplicadas.
        - Admite valores nulos, pero unicamente una clave nula.
        - Es una coleccion que almacena sin ordenar los elementos.
        - No es Sincronizada.
        - Para obtener un valor necesitamos la clave.

    Su nombre y funcionamiento proviene de la tecnica del hashing, que la manera de asignar un codigo
    unico a un elemento por medio de procesos algoritmicos.

    Su funcionamiento es el siguiente, esta coleccion internamente posee un arreglo para almacenar, cuando
    agregamos un elemento al HashMap la clave pasa por una funcion hash la cual nos dira la posicion en la
    que se almacenara en dicho arreglo, puede suceder que varios elementos compartan index esto se conoce como
    colision lo que lleva a crear en dicha posicion un subArreglo para almacenar los elementos cuya posicion sea
    igual ahi, se debe intentar que las colisiones no existan.
*/

public class _03_HashMap {

    public static void main(String[] args) {
        // Definimos nuestro Conjunto con claves de tipo entero y valores cadena:
        HashMap<Integer, String> map = new HashMap<>();

        // Ingresamos elementos al conjunto:
        map.put(1,  "A");
        map.put(2,  "B");
        map.put(3,  "C");

        // Obtenemos el elemento cuya clave se envia por parametro:
        String value = map.get(2);
        System.out.println("Value: " + value);

        // Eliminamos el elemento cuya clave es:
        map.remove(3);

        System.out.println(map);

        // Iteramos entre las claves:
        for (Integer key : map.keySet()) {
            String val = map.get(key);
            System.out.println("The key is :: " + key + ", and value is :: " + val);
        }
    }

}
