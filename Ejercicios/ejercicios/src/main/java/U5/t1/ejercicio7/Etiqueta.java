package U1.ejercicios.src.main.java.U5.t1.ejercicio7;

public class Etiqueta {
    private String destinatario;
    private String direccion;

    public Etiqueta(String destinatario, String direccion) {
        this.destinatario = destinatario;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "destinatario='" + destinatario + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
