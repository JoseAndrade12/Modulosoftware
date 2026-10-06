public class Main {

    public static void main(String[] args) {

        Modulo modulo1 = new Modulo();
        Modulo modulo2 = new Modulo();
        Modulo modulo3 = new Modulo();

        modulo1.nombre = "Login";
        modulo1.lenguaje = "Java";
        modulo1.version = "1.0";
        modulo1.terminado = false;

        modulo2.nombre = "Inventario";
        modulo2.lenguaje = "Java";
        modulo2.version = "1.5";
        modulo2.terminado = false;

        modulo3.nombre = "Reportes";
        modulo3.lenguaje = "Java";
        modulo3.version = "2.0";
        modulo3.terminado = false;

        System.out.println("MÓDULO LOGIN ");
        modulo1.mostrarInformacion();

        System.out.println("\nMÓDULO INVENTARIO");
        modulo2.mostrarInformacion();

        System.out.println("\nMÓDULO REPORTES ");
        modulo3.mostrarInformacion();

        System.out.println("\nMARCANDO UN MÓDULO COMO TERMINADO");

        modulo1.marcarTerminado();

        System.out.println("\nEstados:");
        modulo1.mostrarEstado();
        modulo2.mostrarEstado();
        modulo3.mostrarEstado();

        System.out.println("\nVersiones:");
        modulo1.mostrarVersion();
        modulo2.mostrarVersion();
        modulo3.mostrarVersion();
    }
}