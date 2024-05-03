package Ejercicios.ejercicios.src.main.java.Entregable_PRA_3;

import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Coronavirus {
    private ArrayList<Pacientes> listaPacientes = new ArrayList<>();
    private HashMap<Character, ArrayList<Pacientes>> mapaCepaPacientes;
    private String nombre;
    private String localidad;

    public Coronavirus() {
        this.nombre = "COVID-19";
        this.localidad = "Wuhan";
        mapaCepaPacientes = new HashMap<>();
    }

    public ArrayList<Pacientes> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public HashMap<Character, ArrayList<Pacientes>> getMapaCepaPacientes() {
        return mapaCepaPacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    //--------------------------AÑADIR PACIENTES--------------------------------------------------------

    public void addPaciente(char cepa, Pacientes paciente) {
        rellenar(cepa, paciente);
        anadirPaciente(paciente);
    }

    public void rellenar(char cepa, Pacientes paciente) {
        ArrayList<Pacientes> lista = new ArrayList<>();
        if (mapaCepaPacientes.containsKey(cepa)) {
            lista = mapaCepaPacientes.get(cepa);
            lista.add(paciente);
            System.out.println("Se ha añadido correctamente");
        }
        if (paciente.getCepa() != cepa) {
            System.out.println("Error: El paciente no está infectado con la cepa especificada.");
            return;
        }

        mapaCepaPacientes.put(cepa, lista);
    }

    public void anadirPaciente(Pacientes p) {
        listaPacientes.add(p);
    }

    //--------------------------ELIMINAR PACIENTE--------------------------------------------------------

    public void darDeAlta(Pacientes p) {
        if (listaPacientes.contains(p)) {
            listaPacientes.remove(p);
            System.out.println("Eliminado correctamente");
        } else {
            System.out.println("No se ha encontrado el paciente");
        }
    }

    //--------------------------MOSTRAR PACIENTES DE UN DOCTOR--------------------------------------------------------

    public void pacientesDeUnDoctor(int numero) {
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getMedico().getNumero_colegiado() == numero) {
                System.out.println(paciente);
            } else {
                System.out.println("Este médico/a no lleva ningún paciente.");
            }

        }
    }

    //--------------------------ORDENAR PACIENTES POR PESO--------------------------------------------------------

    public void pacientesporPeso(char cepa) {
        ArrayList<Pacientes> pacientesCepa = new ArrayList<>();
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getCepa() == cepa) {
                pacientesCepa.add(paciente);
            }
        }
        pacientesCepa.sort(new pacientesPorPeso());
        for (Pacientes pacientes : pacientesCepa) {
            System.out.println(pacientes);
        }
    }

    //--------------------------ORDENAR PACIENTES POR EDAD--------------------------------------------------------
    public void pacientesporEdad(char cepa) {
        ArrayList<Pacientes> pacientesCepa = new ArrayList<>();
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getCepa() == cepa) {
                pacientesCepa.add(paciente);
            }
        }
        pacientesCepa.sort(new pacientesPorEdad());
        for (Pacientes pacientes : pacientesCepa) {
            System.out.println(pacientes);
        }
    }

    //--------------------------CARGAR PACIENTES--------------------------------------------------------

    public void cargarPacientes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pacientes.dat"))) {
            mapaCepaPacientes = (HashMap<Character, ArrayList<Pacientes>>) ois.readObject();
            System.out.println("Pacientes cargados correctamente.");

            // Limpiar la lista de pacientes antes de cargar los nuevos
            listaPacientes.clear();

            // Mostrar pacientes cargados por consola
            for (ArrayList<Pacientes> pacientes : mapaCepaPacientes.values()) {
                for (Pacientes paciente : pacientes) {
                    listaPacientes.add(paciente); // Agregar paciente a la lista
                    System.out.println(paciente);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los pacientes: " + e.getMessage());
        }
    }

    //--------------------------GUARDAR PACIENTES--------------------------------------------------------

    public void guardarPacientes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pacientes.dat"))) {
            oos.writeObject(mapaCepaPacientes);
            System.out.println("Pacientes guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los pacientes: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "listaPacientes=" + listaPacientes +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
