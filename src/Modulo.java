public class Modulo {

    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " ha sido terminado.");
    }

    void mostrarEstado() {
        if (terminado) {
            System.out.println(nombre + ": Terminado");
        } else {
            System.out.println(nombre + ": En desarrollo");
        }
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}
