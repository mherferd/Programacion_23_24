package U9.Entregable;

public class Main {
    public static void main(String[] args) {

        Transacciones transacciones = new Transacciones();
        Consultas consultas = new Consultas();


        System.out.println("----------------------------- CONSULTA 1 ------------------------------------");
        consultas.empleadosOficinaMayor();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();


        System.out.println("----------------------------- CONSULTA 2 ------------------------------------");
        consultas.productosNoVendidos();
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();

        System.out.println("----------------------------- CONSULTA 3 ------------------------------------");
        consultas.informeCategoria();
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("----------------------------- TRANSACCION 1 ------------------------------------");
        transacciones.transaccion1();
        System.out.println("-----------------------------------------------------------------");


        System.out.println("----------------------------- TRANSACCION 2 ------------------------------------");
        transacciones.transaccion2();
        System.out.println("-----------------------------------------------------------------");



    }
}
