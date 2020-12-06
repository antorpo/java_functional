package functional._07_lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/*
    Uso de lambdas como funciones anonimas de un solo uso, y su sintaxis.
 */

public class _07_Lambda {

    @FunctionalInterface
    interface MiFuncion{
        Integer restar(Integer a, Integer b);
    }

    public static void main(String[] args) {
        List<String> cursos = getList("Algoritmos", "Ecuaciones", "Arquicompu", "Ingles");
        cursos.forEach(System.out::println);

        // lambda con multiples parametros:
        BiFunction<Integer, Integer, String> multi = (a,b) -> "Multi: " + (a*b);

        Predicate<String> validarNombre = s -> s.equals("Antonio");

        System.out.println(validarNombre.test("Antonio"));

        String result = useBiFunction((x, y) -> "Suma: " + (x+y));
        System.out.println(result);

        // lambda que no recibe parametros:
        int result2 = lambdaAnonimo(() -> 100);
        System.out.println(result2);

        // lambda con mas de una declaracion (cuerpo);
        BiFunction<Integer, Integer, String> comparador = (a,b) -> {
            String x = "";
            if(a > b){
                x = "a is greater than b";
            }else if (a < b){
                x = "b is greater than a";
            }else{
                x = "a and b are equal";
            }

            return x;
        };

        String result3 = comparador.apply(10, 20);
        System.out.println(result3);

        MiFuncion hola = (a, b) -> a - b;
        System.out.println(hola.restar(10, 5));

        // Las funciones no sirven con los metodos primitivos:
        //BiFunction<int, int, Boolean> otraFuncion = (a,b) -> a == b;
        BiFunction<Integer, Integer, Boolean> otraFuncion = Integer::equals;
    }

    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }

    // HIGH-ORDER FUNCTIONS -> Reciben o devuelven funciones.
    public static String useBiFunction(BiFunction<Integer, Integer, String> function){
        return "Resultado -> " + function.apply(5, 3);
    }

    public static int lambdaAnonimo(Supplier<Integer> function){
        return function.get();
    }
}
