package functional._02_consumer_supplier;
import java.util.function.*;
/*
    -> Consumer: Es una interfaz funcional, cuya funcionalidad es consumir datos:
    Representa una operacion que acepta un unico argumento pero no retorna valor,
    ejecuta una funcion sobre el argumento enviado, operando via efectos-secundarios.

    Ejemplo: Un consumer que reciba una lista de archivos y vamos a ejecutar una funcion para eliminarlos
    la cual no retorna nada, o cuando vamos a guardar un listado de elementos en la base de datos.

    Consumer<T>
    Metodo .accept()

    -> Supplier: Es una interfaz funcional, cuya funcionalidad es de suplir datos:
    Representa una operacion que no recibe parametros, pero retorna, genera valores que podamos necesitar,
    similar a una factoria.
 */

public class _02_Consumer {

    private static void persistAccount(Account account) {
        // Simulamos el proceso de guardar en un archivo y en una base de datos, procesos que no retornan nada.
        Consumer<Account> toFile = acnt -> saveToFile(acnt);
        Consumer<Account> toDB = acnt -> getDataBaseConnection().insert(acnt);

        // Creamos un metodo que reciba el Consumer para almacenar la cuenta.
        saveAccountTo(account, toFile);
        saveAccountTo(account, toDB);
    }

    private static void saveAccountTo(Account account, Consumer<Account> saveFunction) {
        // Aca podemos tener algunas validaciones antes de almacenar.
        // Si todos esta bien .accept(), aceptamos que se ejecute la accion.
        saveFunction.accept(account);
    }

    private void supplierDemo() {
        Supplier<Double> numberSupplier = Math::random;

        Supplier<DataBaseExecutor> dbSupplier = _02_Consumer::getDataBaseConnection;

        Function<String, Integer> dbFunction = sId -> dbSupplier.get().select(sId);
    }


    private static void saveToFile(Account account) {}

    private static DataBaseExecutor getDataBaseConnection() {
        return null;
    }

    private class Account {
        private final String id;
        private final double balance;

        public Account(String id, double balance) {
            this.id = id;
            this.balance = balance;
        }
    }

    private interface DataBaseExecutor {
        <T> void insert(T instance);

        <T> T select(String id);
    }


}
