package U1.ejercicios.src.main.java.U6.t1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        String texto="";
        int n_lineas=0;
        int n_paginas=2;
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Ficheros_UD6\\t1\\Ej7\\ej7.txt"));
            String linea = in.readLine();
            System.out.println("PAGINA 1");
            while (linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
                n_lineas++;
                if(n_lineas==24){
                    texto += linea + "\n \nPAGINA "+n_paginas +"\n";
                    n_lineas=0;
                    n_paginas++;}
                }


            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }
}
