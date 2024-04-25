package Ejercicios.ejercicios.src.main.java.Entregable_PRA_4;

public class Main {
    public static void main(String[] args) {
        SAE sae = new SAE();

        // Crear trabajadores
        Trabajador t1 = new Trabajador("11111111A", "Juan", "García", 25, "Ingeniería Informática");
        Trabajador t2 = new Trabajador("22222222B", "María", "Martínez", 30, "Administración de Empresas");
        // Añadir más trabajadores según sea necesario...

        // Crear ofertas
        Oferta o1 = new Oferta(1, "Programador Java Junior");
        Oferta o2 = new Oferta(2, "Administrativo");
        // Añadir más ofertas según sea necesario...

        // Añadir trabajadores a las ofertas
        sae.addTrabajador(1, t1);
        sae.addTrabajador(1, t2);
        sae.addTrabajador(2, t1);
        // Añadir más trabajadores a las ofertas según sea necesario...

        // Añadir ofertas al SAE
        sae.addOferta(o1);
        sae.addOferta(o2);
        // Añadir más ofertas al SAE según sea necesario...

        // Mostrar las ofertas
        sae.mostrarOfertas();

        // Guardar los datos en un fichero binario
        sae.guardarDatos();

        // Cargar los datos desde el fichero binario
        sae.cargarDatos();
    }
}
