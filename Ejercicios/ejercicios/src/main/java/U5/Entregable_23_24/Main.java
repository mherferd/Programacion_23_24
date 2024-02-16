package U1.ejercicios.src.main.java.U5.Entregable_23_24;

public class Main {
    public static void main(String[] args) {
        Baloncestistas b1 = new Baloncestistas ("Miguel", 18, 1.80);
        Baloncestistas b2 = new Baloncestistas ("Jose", 19, 1.70);
        Baloncestistas b3 = new Baloncestistas ("Antonio", 17, 1.90);
        Baloncestistas b4 = new Baloncestistas ("Raul", 22, 1.85);

        PeladoresGambas p1 = new PeladoresGambas("David", 22, 75);
        PeladoresGambas p2 = new PeladoresGambas("Chema", 20, 70);
        PeladoresGambas p3 = new PeladoresGambas("Largo", 19, 65);
        PeladoresGambas p4 = new PeladoresGambas("Gus", 21, 73);

        LanzadoresTroncos lt1 = new LanzadoresTroncos("Fekir", 25, LanzadoresTroncos.Tipo_Prueba.PINO);
        LanzadoresTroncos lt2 = new LanzadoresTroncos("Lebron", 23, LanzadoresTroncos.Tipo_Prueba.ROBLE);
        LanzadoresTroncos lt3 = new LanzadoresTroncos("Ruru", 16, LanzadoresTroncos.Tipo_Prueba.OLIVO);
        LanzadoresTroncos lt4 = new LanzadoresTroncos("Selu", 27, LanzadoresTroncos.Tipo_Prueba.OLIVO);

        Baloncesto baloncesto = new Baloncesto("Encestournament", "Cartuja", 12);
        PeladoDeGambas peladoDeGambas = new PeladoDeGambas("Pelado Mundial", "Triana", 6);
        LanzaTroncosPelaos lanzaTroncosPelaos = new LanzaTroncosPelaos("Lanzamiento Final", "Amate", 10);
        //--------------------------------------------------------------------------------------------------------------------------------


        baloncesto.insertar_participante(b1);
        baloncesto.insertar_participante(b2);
        baloncesto.insertar_participante(b3);
        baloncesto.insertar_participante(b4);
        //System.out.println(baloncesto);

        peladoDeGambas.insertar_participante(p1);
        peladoDeGambas.insertar_participante(p2);
        peladoDeGambas.insertar_participante(p3);
        peladoDeGambas.insertar_participante(p4);
        //System.out.println(peladoDeGambas);

        lanzaTroncosPelaos.insertar_participante(lt1);
        lanzaTroncosPelaos.insertar_participante(lt2);
        lanzaTroncosPelaos.insertar_participante(lt3);
        lanzaTroncosPelaos.insertar_participante(lt4);
         //System.out.println(lanzaTroncosPelaos);

        //baloncesto.eliminar_integrante(b3);
        //System.out.println(baloncesto);


        Pais pais1 = new Pais("Espania",6);
        Pais pais2 = new Pais("Francia",8);
        Pais pais3 = new Pais("EE.UU.",15);
        Pais pais4 = new Pais("India",10);

        Juegos juego1 = new Juegos(2024, "Madrid");

        juego1.insertar_pais(pais1);
        juego1.insertar_pais(pais2);
        juego1.insertar_pais(pais3);
        juego1.insertar_pais(pais4);

        juego1.insertar_deportes(baloncesto);
        juego1.insertar_deportes(peladoDeGambas);
        juego1.insertar_deportes(lanzaTroncosPelaos);

        System.out.println(juego1);


        //MUESTRA TODA LA INFORMACIÓN DE JUEGO, PERO CON LOS PAISES ORDENADOS.

        juego1.mostrarPaises();
        //System.out.println(juego1);

        juego1.mostrarPaisesParaCeremonia();
        //System.out.println(juego1);

        // participantes de un determinado deporte ordenados por edad:
        baloncesto.mostrarParticipantes();
        peladoDeGambas.mostrarParticipantes();



                //INTENTO DEL ÚLTIMO COMPARABLE*
        //Baloncestistas[] lista_baloncesto = new Baloncestistas[4];
        //lista_baloncesto[0]=b1;
        //lista_baloncesto[1]=b2;
        //lista_baloncesto[2]=b3;
       // lista_baloncesto[3]=b4;





    }
}
