package Ejercicios.ejercicios.src.main.java.Entregable_PRA_4;

import java.io.*;
import java.util.*;

public class SAE implements Serializable {
    private Map<Integer, Oferta> ofertas;

    public SAE() {
        this.ofertas = new TreeMap<>();
    }

    public boolean addOferta(Oferta o) {
        if (!ofertas.containsKey(o.getCodigo())) {
            ofertas.put(o.getCodigo(), o);
            return true;
        }
        return false;
    }

    public boolean addTrabajador(Integer codigo, Trabajador t) {
        if (ofertas.containsKey(codigo)) {
            Oferta o = ofertas.get(codigo);
            return o.addTrabajador(t);
        }
        return false;
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t) {
        if (ofertas.containsKey(codigo)) {
            Oferta o = ofertas.get(codigo);
            return o.removeTrabajador(t);
        }
        return false;
    }

    public void mostrarTrabajadores(Integer codigo) {
        if (ofertas.containsKey(codigo)) {
            Oferta o = ofertas.get(codigo);
            List<Trabajador> trabajadores = o.getTrabajadores();
            if (!trabajadores.isEmpty()) {
                System.out.println("Trabajadores inscritos en la oferta " + codigo + ":");
                for (Trabajador t : trabajadores) {
                    System.out.println(t);
                }
            } else {
                System.out.println("No existen trabajadores inscritos en la oferta " + codigo);
            }
        } else {
            System.out.println("No existe la oferta con código " + codigo);
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo) {
        if (ofertas.containsKey(codigo)) {
            Oferta o = ofertas.get(codigo);
            List<Trabajador> trabajadores = o.getTrabajadores();
            if (!trabajadores.isEmpty()) {
                System.out.println("Trabajadores inscritos en la oferta " + codigo + " ordenados por edad:");
                trabajadores.sort(Comparator.comparingInt(Trabajador::getEdad).thenComparing(Trabajador::getNombre));
                for (Trabajador t : trabajadores) {
                    System.out.println(t);
                }
            } else {
                System.out.println("No existen trabajadores inscritos en la oferta " + codigo);
            }
        } else {
            System.out.println("No existe la oferta con código " + codigo);
        }
    }

    public int cantidadOfertas(String dni) {
        int count = 0;
        for (Oferta o : ofertas.values()) {
            List<Trabajador> trabajadores = o.getTrabajadores();
            for (Trabajador t : trabajadores) {
                if (t.getDni().equals(dni)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public void mostrarOfertas() {
        List<Oferta> listaOfertas = new ArrayList<>(ofertas.values());
        listaOfertas.sort(Comparator.comparingInt(o -> o.getTrabajadores().size()));
        Collections.reverse(listaOfertas);

        System.out.println("Ofertas de trabajo ordenadas por número de trabajadores solicitantes:");
        for (Oferta o : listaOfertas) {
            System.out.println(o);
        }
    }

    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"))) {
            oos.writeObject(this);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"))) {
            SAE sae = (SAE) ois.readObject();
            this.ofertas = sae.ofertas;
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }
}