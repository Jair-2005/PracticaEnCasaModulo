//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = false;

        inventario.nombre = "Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "0.8";
        inventario.terminado = false;

        reportes.nombre = "Reportes";
        reportes.lenguaje = "C#";
        reportes.version = "0.3";
        reportes.terminado = false;

        System.out.println(" Información inicial ");
        login.mostrarInformacion();
        System.out.println();
        inventario.mostrarInformacion();
        System.out.println();
        reportes.mostrarInformacion();

        System.out.println("\n Se marca como terminado solo el Login ");
        login.marcarTerminado();

        System.out.println("\n Estado de cada módulo ");
        login.mostrarEstado();
        inventario.mostrarEstado();
        reportes.mostrarEstado();

        System.out.println("\n Versiones ");
        login.mostrarVersion();
        inventario.mostrarVersion();
        reportes.mostrarVersion();
    }
}
