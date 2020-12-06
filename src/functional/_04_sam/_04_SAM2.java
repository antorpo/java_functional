package functional._04_sam;
import java.sql.SQLOutput;
import java.util.function.*;

/*
    Vamos a crear una interfaz funcional
    que nos permita calcular si un estudiante
    aprobo calculando el promedio de dos notas.
 */

public class _04_SAM2 {

   @FunctionalInterface
    interface estudianteOp1{
        Double promedio(Double n1, Double n2);
    }

    @FunctionalInterface
    interface estudianteOp2{
       Double notas(Double n1, Double n2);

       /*
            Utilizamos el metodo default implementado para apoyar
            al proceso de la funcion notas.
        */
        default boolean aprovado(Double n1, Double n2){
           /*
                Cuando instanciamos la interfaz le definimos el comportamiento a notas()
                para poder utilizarlo libremente.
            */
           return notas(n1, n2)/2 > 3.0;
       }
    }

    public static void main(String[] args) {
        Alumno a1 = new Alumno(3.0, 2.0);
        Alumno a2 = new Alumno(5.0, 4.0);

        /*
            Cuando instancioamos una interfaz funcional
            definimos el comportamiento del metodo abstracto nosotros
            y simplemente ya podemos utilizarla invocando al metodo
            abstracto y pasando los valores por parametro.
         */
        estudianteOp1 op1 = (n1, n2) -> (n1 + n2)/2; // En este caso le estamos definiendo el comportamiento a promedio()
        Double promedio1 = op1.promedio(a1.getNota1(), a1.getNota2());

        System.out.println("Promedio estudiante 1: " + promedio1);

        /*
            Definimos el comportamiento del SAM de la interfaz que en este caso toma dos flotantes y los suma
            con esto ya cada vez que utilicemos op2.notas(n1, n2) se ejecutara la funcion que definimos al
            instanciar, ya con los metodos default que pueden ser implementados podemos dar soporte a mas
            funcionalidad sin conocer de antemano como sera la definicion de notas.
        */
        estudianteOp2 op2 = Double::sum;
        // Vamos a utilizar directamente el metodo por default que se apoya en el SAM para saber si aprobo o no:

        System.out.println("Estudiante #2 aprueba: " + op2.aprovado(a2.getNota1(), a2.getNota2()));

    }


}

class Alumno{
    private Double nota1;
    private Double nota2;

    public Alumno(Double nota1, Double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }
}
