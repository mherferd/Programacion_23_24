package Ejercicios.ejercicios.src.main.java.Entregable_PRA_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Oferta implements Serializable {
    private Integer codigo;
    private String descripcion;
    private List<Trabajador> trabajadores;
    private boolean cubierta;

    public Oferta(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.trabajadores = new ArrayList<>();
        this.cubierta = false;
    }

    // Getters
    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public boolean isCubierta() {
        return cubierta;
    }

    // Métodos para añadir y quitar trabajadores
    public boolean addTrabajador(Trabajador t) {
        if (!trabajadores.contains(t)) {
            trabajadores.add(t);
            Collections.sort(trabajadores, Comparator.comparing(Trabajador::getApellidos).thenComparing(Trabajador::getNombre));
            return true;
        }
        return false;
    }

    public boolean removeTrabajador(Trabajador t) {
        return trabajadores.remove(t);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " - Descripción: " + descripcion + " - Cubierta: " + (cubierta ? "Sí" : "No");
    }
}
