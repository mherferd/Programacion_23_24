package U1.ejercicios.src.main.java.U4.t1.Ejercicio5;

import java.util.Scanner;

public class Texto {
    private long longitud;
    private String cadena;
    public String caracter_principio;
    public String caracter_final;

    public Texto(long longitud, String cadena) {
        this.longitud = longitud;
        this.cadena=cadena;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "cadena='" + cadena + '\'' +
                '}';
    }

    public String sumarcaracter1(String caracter){
        String mensaje = caracter+cadena;
        if (mensaje.length()<longitud){
            mensaje=caracter+cadena;
        }
        else {
            System.out.println("No se puede");
            mensaje=cadena;
        }

        return mensaje;

    }

    public String sumarcaracter2(String caracter2){
        String mensaje=cadena+caracter2;
        if (mensaje.length()<longitud){
            mensaje=cadena+caracter2;
        }
        else {
            System.out.println("no se puede");
            mensaje=cadena;
        }

        return mensaje;

    }
    public void contarMAYUSminus (){
        int contadorMAYUS =0, contadorminus=0;
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) =='A' ){
                contadorMAYUS++;
            }
            if (cadena.charAt(i) =='E' ){
                contadorMAYUS++;
            }
            if (cadena.charAt(i) =='I' ){
                contadorMAYUS++;
            }
            if (cadena.charAt(i) =='O' ){
                contadorMAYUS++;
            }
            if (cadena.charAt(i) =='U' ){
                contadorMAYUS++;
            }
            if (cadena.charAt(i) =='a' ){
                contadorminus++;
            }
            if (cadena.charAt(i) =='e' ){
                contadorminus++;
            }
            if (cadena.charAt(i) =='i' ){
                contadorminus++;
            }
            if (cadena.charAt(i) =='o' ){
                contadorminus++;
            }
            if (cadena.charAt(i) =='u' ){
                contadorminus++;
            }

        }
        System.out.println("La cantidad de vocales mayúsculas es :" +contadorMAYUS);
        System.out.println("La cantidad de vocales minúsculas es :" +contadorminus);
    }

}




