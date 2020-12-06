package functional._05_reference_operator;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/*
    -> The double colon ( :: ) operator, also known as method reference
    operator in Java, is used to call a method by referring to it with the
    help of its class directly. They behave exactly as the lambda
    expressions. The only difference it has from lambda expressions is
    that this uses direct reference to the method by name instead of
    providing a delegate to the method.

    Method reference or double colon operator can be used to refer:
        1. A static method: (ClassName::methodName)
        2. An instance method: (objectOfClass::methodName)
        3. A constructor: (super::methodName)

    -> Java incluye este operador para hacer referencia a metodos o funciones que ya estan definidas
    en una clase o un objeto.

    Una lambda sigue siendo una funcion es decir un metodo, por lo tanto podemos sustituir
    una funcion lambda con un metodo tradicional por medio de la referencia a estos usando
    el operador ::.

    En otras palabras nos sirve para definir el comportamiento de una funcion (lambda) en terminos
    de un metodo tradicional alojado en una clase, sin volver a repetir codigo. Muchas veces usamos
    expresiones lambda para crear metodos anonimos, sin embargo las lambdas que creamos no hacen nada
    sino que llaman un metodo existente, es estos casos es mas claro referirnos al metodo por el nombre
    de una manera mas compacta, precisamente esto es lo que nos permite el operador de referencia,
    una sintaxis mas amigable.
 */

public class _05_Reference_Operator {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Fer");
        names.add("Orly");
        names.add("Sier");
        names.add("Chris");
        names.add("Eryx");

        /*
            Procesamos en una lambda:
            forEach toma un Consumer<T>, los Consumers son
            funciones que toman un valor pero no retornan nada,
            simplemente opera.
        */
        names.forEach(s -> System.out.println(s));


        List<String> profesores = getList("Antonio", "Natalia", "Camilo", "Pedro");


        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        //profesores.forEach(printer);

        Consumer<String> printer2 = s -> System.out.println(s);
        //profesores.forEach(printer2);

        // Podemos copiar directamente la definicion del Consumer adentro:
        //profesores.forEach(s -> System.out.println(s));


        // .forEach(Consumer<T>)
        // (Clase) System.out::println (Metodo)
        profesores.forEach(System.out::println);

        /* Expresiones equivalentes:
          (Clase) TestClass::modificaNombre (Metodo)
           Como la expresion lambda invoca un metodo existente, podemos usar el operador
           de referencia en lugar de la expresion lambda y asi tener una sintaxis
           mas compacta.
         */
        profesores.forEach(s -> TestClass.modificaNombre(s));
        profesores.forEach(TestClass::modificaNombre); // Podemos ver que automaticamente pasa el parametro al metodo.
    }

    static class TestClass {
        public static void modificaNombre(String nombre) {
            System.out.println(nombre + " es profesor.");
        }
    }

    public static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }

}
