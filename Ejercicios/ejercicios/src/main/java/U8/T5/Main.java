package U8.T5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Futbolista> PLANTILLA_SPAIN_2010 = new ArrayList<>();

        Gson gson = new Gson();

        Futbolista futbolista1 = new Futbolista(1, "Casillas", "Real Madrid");
        Futbolista futbolista2 = new Futbolista(3, "Pique",  "FC Barcelona");
        Futbolista futbolista3 = new Futbolista(15, "Ramos", "Real Madrid");
        Futbolista futbolista4 = new Futbolista(5, "Puyol", "FC Barcelona");
        Futbolista futbolista5 = new Futbolista(11, "Capdevila","Villareal");
        Futbolista futbolista6 = new Futbolista(14, "Xabi Alonso", "Real Madrid");
        Futbolista futbolista7 = new Futbolista(16, "Busquets", "FC Barcelona");
        Futbolista futbolista8 = new Futbolista(8, "Xavi Hernandez", "FC Barcelona");
        Futbolista futbolista9 = new Futbolista(18, "Pedrito", "FC Barcelona");
        Futbolista futbolista10 = new Futbolista(6, "Iniesta", "FC Barcelona");
        Futbolista futbolista11 = new Futbolista(7, "Villa", "FC Barcelona");

        PLANTILLA_SPAIN_2010.add(futbolista1);
        PLANTILLA_SPAIN_2010.add(futbolista2);
        PLANTILLA_SPAIN_2010.add(futbolista3);
        PLANTILLA_SPAIN_2010.add(futbolista4);
        PLANTILLA_SPAIN_2010.add(futbolista5);
        PLANTILLA_SPAIN_2010.add(futbolista6);
        PLANTILLA_SPAIN_2010.add(futbolista7);
        PLANTILLA_SPAIN_2010.add(futbolista8);
        PLANTILLA_SPAIN_2010.add(futbolista9);
        PLANTILLA_SPAIN_2010.add(futbolista10);
        PLANTILLA_SPAIN_2010.add(futbolista11);

        ArrayList<String> Posiciones1 = new ArrayList<>();
        Posiciones1.add("Portero");

        ArrayList<String> Posiciones2 = new ArrayList<>();
        Posiciones2.add("Central");

        ArrayList<String> Posiciones3 = new ArrayList<>();
        Posiciones3.add("Lateral derecho");
        Posiciones3.add("Medio Centro");

        ArrayList<String> Posiciones4 = new ArrayList<>();
        Posiciones4.add("Central");

        ArrayList<String> Posiciones5 = new ArrayList<>();
        Posiciones5.add("Lateral izquierdo");

        ArrayList<String> Posiciones6 = new ArrayList<>();
        Posiciones6.add("Defensa Mediocampo");
        Posiciones6.add("Mediocampo");

        ArrayList<String> Posiciones7 = new ArrayList<>();
        Posiciones7.add("Defensa mediocampo");

        ArrayList<String> Posiciones8 = new ArrayList<>();
        Posiciones8.add("Mediocampo");

        ArrayList<String> Posiciones9 = new ArrayList<>();
        Posiciones9.add("Extremo izquierdo");
        Posiciones9.add("Falso extremo");

        ArrayList<String> Posiciones10 = new ArrayList<>();
        Posiciones10.add("Extremo derecho");
        Posiciones10.add("Mediocampo");

        ArrayList<String> Posiciones11 = new ArrayList<>();
        Posiciones11.add("Delantero centro");

        futbolista1.setPosiciones(Posiciones1);
        futbolista2.setPosiciones(Posiciones2);
        futbolista3.setPosiciones(Posiciones3);
        futbolista4.setPosiciones(Posiciones4);
        futbolista5.setPosiciones(Posiciones5);
        futbolista6.setPosiciones(Posiciones6);
        futbolista7.setPosiciones(Posiciones7);
        futbolista8.setPosiciones(Posiciones8);
        futbolista9.setPosiciones(Posiciones9);
        futbolista10.setPosiciones(Posiciones10);
        futbolista11.setPosiciones(Posiciones11);



        System.out.println(gson.toJson(PLANTILLA_SPAIN_2010));
        String json_completo = gson.toJson(PLANTILLA_SPAIN_2010);


        ArrayList<Futbolista> PLANTILLA = gson.fromJson(json_completo,  PLANTILLA_SPAIN_2010.getClass());
        System.out.println(PLANTILLA);



        String json_ramos = gson.toJson(Posiciones3);
        Type listType = new TypeToken<ArrayList<String>>() {}.getType();
        ArrayList<String> posiciones_ramos = gson.fromJson(json_ramos, listType);
        System.out.println(posiciones_ramos);
    }
}
