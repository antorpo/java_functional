package functional._03_operators_bifunctions;
import java.util.function.*;

/*
    -> UnaryOperator: Es una interfaz funcional que extiende de Function, recibe un unico parametro de un tipo
    generico y su resultado es del mismo tipo, basicamente es una variacion de Function cuando el operando y el
    resultado son del mismo tipo, ahorra sintaxis y se ve mas elegante.

    UnaryOperator<T>
    UnaryOperator<T> extends Function<T, T> (Recibe T, devuelve T).
    Metodo .apply()


    -> BiFunction: Es una interfaz funcional que extiende de Function, recibe tres parametros los dos primeros son los
    tipos de datos (Operandos) y el tercero es el tipo del resultado a devolver.

    BiFunction<T, U, R>
    Metodo .apply()

     -> BinaryOperator: Es una interfaz funcional que extiende de BiFunction, la principal diferencia con BiFunction
    es que esta interfaz solo recibe un parametro y sera el tipo de dos los dos Operandos y el resultado, es decir
    cuando tanto operandos como resultado sean del mismo tipo podemos ahorrar sintaxis usando el BinaryOperator, es
    analogo a Function y UnaryOperator. Bajo esta definicion podemos definir una interfaz funcional que sea una
    funcion que reciba la cantidad de operadores que queramos y crear su operador cuando todos los operadores son del
    mismo tipo.

    BinaryOperator<T>
    BinaryOperator<T> extends BiFunction<T, U, R>
    Metodo .apply()
 */

public class _03_OperatorsAndBiFunctions {

    public static void main(String[] args) {
        // (String) -> String, equivalente a Function<String, String>
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        // (Integer,Integer) -> Integer
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a*b;

        // (Integer) -> Integer, equivalente a BiFunction<Integer, Integer, Integer>
        BinaryOperator<Integer> multiply2 = (a,b) -> a*b;

        // (String, Integer) -> String
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);

        System.out.println(quote.apply("Antonio"));
        System.out.println(multiply.apply(5, 3));
        System.out.println(multiply2.apply(3, 5));
        System.out.println(leftPad.apply("Java", 4));
    }
}
