package collections._00_interfaces;

/*
    Interface Map<K,V>

    Type Parameters:
    K - the type of keys maintained by this map
    V - the type of mapped values

    Esta interfaz no hereda de ninguna de las mencionadas anteriormente, ni siquiera de
    Iterable<E>, esta interfaz nos permite almacenar datos en parejas clave-valor como
    si se tratara de un diccionario, no puede contener claves duplicadas.

    Colecciones como HashMap, HashTable, TreeMap implementan de esta interfaz.
*/

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class _00_Map {

    public static void main(String[] args) {
        Map<String, Integer> mapA = new MapExample();

        // No implementados:
        mapA.get("clave1");

        BiFunction<String, Integer, Integer> biFunct = (a,b) -> 2*b;
        mapA.computeIfPresent("clave2", biFunct);

        mapA.compute("clave", new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return null;
            }
        });

    }

}

class MapExample implements Map<String, Integer> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Integer get(Object key) {
        return null;
    }

    @Override
    public Integer put(String key, Integer value) {
        return null;
    }

    @Override
    public Integer remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Integer> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Integer> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Integer>> entrySet() {
        return null;
    }
}
