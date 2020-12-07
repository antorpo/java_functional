package collections._00_interfaces;

/*
    public interface Cloneable

    A class implements the Cloneable interface to indicate to the Object.clone() method
    that it is legal for that method to make a field-for-field copy of instances of that class.

    Esta interfaz no posee ningun metodo abstracto para implementar solo sirve para identificar
    semanticamente que se puede clonar, lo mismo sucede con la interfaz Serializable.
*/
public class _00_Cloneable {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Antonio", "Gonzalez", "1");
        Alumno a2 = (Alumno) a1.clone();

        System.out.println(a1);
        System.out.println(a2);
    }

}

class Alumno implements Cloneable{
    private String nombre;
    private String apellido;
    private String documento;

    public Alumno(String nombre, String apellido, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Object clone(){
        Object obj = null;
        try{
            // Llamamos a la clase padre en este caso Object y invocamos el metodo .clone()
            obj = super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println("No se puede clonar!");
        }

        return obj;
    }
}
