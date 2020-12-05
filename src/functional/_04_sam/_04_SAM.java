package functional._04_sam;
import java.util.function.*;

/*
    Single Abstract Method (SAM):
    Es una interfaz que cuenta unicamente con la firma de un metodo (abstracto), pudiendo tener
    otros static y default, tener unicamente un metodo abstracto es condicion que nos permitira
    convertir el SAM en una interfaz funcional (Usando el decorador @FunctionalInterface).

    Esta condicion se tiene para facilitar el uso de lambdas, ya que estas solo proveen
    implementacion para un solo metodo, si se tuviera mas metodos la lambda no sabria reconocerlas,
    ademas de que no se permitiria la creacion de la interfaz funcional.
*/

public class _04_SAM {

    /*
        Creamos nuestra propia interfaz funcional, la cual solo debe tener un metodo abstracto (Soporte lambda).
        Esta interfaz se desarrollo pensando en BiFunction<T, U, R>.
        Recibe tres operandos genericos y un retorno generico.
    */
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    /*
        No podemos etiquetarla como interfaz funcional
        porque tiene mas de una firma abstracta.
     */
    //@FunctionalInterface
    interface NOTSAMinterface<T>{
        T operacion1(T t);
        T operacion2(T t);
    }

    /*
        De manera complementaria de BiFunction<T, U, R> -> BinaryOperator<T> se crea:
        TriFunction<T, U, V, R> -> TriOperator<T> (TriFunction<T, T, T, T>)

        Que es cuando todos los parametros de Operadores incluyendo el resultado son del
        mismo tipo, asi para tener una sintaxis mas limpia.
     */
    @FunctionalInterface
    interface TriOperator<T> extends TriFunction<T, T, T, T>{}

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, String> test = new TriFunction<Integer, Integer, Integer, String>() {
            @Override
            public String apply(Integer i, Integer i2, Integer i3) {
                return "-> " + i + " - " + i2 + " - " + i3;
            }
        };

        TriFunction<Integer, Integer, Integer, String> test2 = (a, b, c) -> "Result: " + (a * b * c);

        TriOperator<Integer> test3 = new TriOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer i2, Integer i3) {
                return i*i2*i3;
            }
        };

        TriOperator<Integer> test4 = (a, b, c) -> a*b*c;

        System.out.println(test.apply(3, 4, 5));
        System.out.println(test2.apply(3, 3, 3));
        System.out.println(test3.apply(3, 3 ,3));
        System.out.println(test4.apply(3, 3 ,3));
    }

}
