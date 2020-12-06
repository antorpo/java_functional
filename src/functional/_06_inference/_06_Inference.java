package functional._06_inference;
import java.util.Arrays;
import java.util.function.*;
import java.util.List;

/*
    Type inference is a Java compiler's ability to look at each method invocation and corresponding
    declaration to determine the type argument (or arguments) that make the invocation applicable.
*/

public class _06_Inference {

    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora = integer -> "El doble es " + (integer*2);

        List<String> alumnos = getList("Paco", "Momon", "Aurelio", "Violeta", "Pato");

        // No es obligatorio colocar el tipo del dato ya que Java lo infiere, a esto se le conoce como (Inferencia de Tipos).
        //alumnos.forEach((String name ) -> System.out.println(name));
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println); // Usando el operador de referencia
    }

    public static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }

}
