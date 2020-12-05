package functional._01_predicates;
import java.util.ArrayList;
import java.util.function.Predicate;

/*
    -> Predicate:
    Es una interfaz funcional, recibe un unico parametro de un tipo
    generico que define una condicion que un objeto determinado debe cumplir,
    nos permite definir criterios y validaciones, todos esto evaluando el valor de verdad de
    determinada condicion.

    Predicate<T>
    Metodo .test()
 */

public class _01_Predicate {

    public static void main(String[] args) {
        Persona p1 = new Persona("Antonio", "Gonzalez", 21);
        Persona p2 = new Persona("Natalia", "Restrepo", 34);
        Persona p3 = new Persona("Mario", "Bros", 25);
        Persona p4 = new Persona("Camila", "Henao", 11);
        Persona p5 = new Persona("Juan", "Gonzalez", 10);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        // Validamos quienes son mayores de edad:
        for (Persona p : personas){
            System.out.println(p.getNombre() + " es mayor de edad: " + mayorDeEdad(p));
        }

        // Calcular si un numero es par con un predicado:
        Predicate<Integer> esParPredicate = x -> x % 2 == 0;

        /* La principal diferencia entre estas dos funciones es que la primera ya se pueden involucrar
           como variable ya que es un objeto, puede ser parametro o recibirlas como retorno de otra funcion.  */
        System.out.println(esParPredicate.test(4));
        System.out.println(esPar(4));

    }

    public static boolean esPar(int num){
        return num % 2 == 0;
    }

    public static boolean mayorDeEdad(Persona p){
        Predicate<Persona> esMayor = x -> x.getEdad() >= 18;

        return esMayor.test(p);
    }

    private static boolean checkPassword(String password) {
        Predicate<String> isAllWhite = s -> s.trim().isEmpty();
        Predicate<String> hasGoodLength = s -> s.length() > 8;
        Predicate<String> hasAtLeastOneNumber = s -> s.matches("\\d+");
        Predicate<String> hasAnUpperCaseLetter = s -> s.matches("[A-Z]+");

        Predicate<String> isAValidPassword = s ->
                !isAllWhite.test(s)
                        && hasGoodLength.test(s)
                        && hasAtLeastOneNumber.test(s)
                        && hasAnUpperCaseLetter.test(s);

        return isAValidPassword.test(password);
    }


}