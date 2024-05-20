package U8.T6;

public class Futbolistas {
    private int id;
    private String nombre;
    private String equipo;
    private Estadisticas estadisticas;

    public Futbolistas(int id, String nombre, String equipo, Estadisticas estadisticas) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Futbolistas{" +
                "id=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Equipo='" + equipo + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }
}
