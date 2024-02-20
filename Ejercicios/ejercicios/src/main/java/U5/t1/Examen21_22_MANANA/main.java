package U1.ejercicios.src.main.java.U5.t1.Examen21_22_MANANA;

public class    main {
    public static void main(String[] args) {
        Personas p1 =new Personas("12345678F","Jose Mota");
        Personas p2 =new Personas("12345612V","Xiaodon Ji");
        Personas p3 =new Personas("87654321A","Calamardo Perez");
        Personas p4 =new Personas("00011101G","Patricio Estrella");
        Personas p5 =new Personas("44444444F","Javier Roman");
        Personas p6 =new Personas("54545454L","Sergio Canales");
        Personas p7 =new Personas("13013013G","Ilia Topuria");
        Personas p8 =new Personas("99999999G","Ibai Llanos");

        Viviendas v1 = new Viviendas(2005,"Avenida de los rojos",150,2,3,3,300000);
        Viviendas v2 = new Viviendas(2014,"Calle Betis",80,1,3,3,150000);
        LocalComercial LC1 = new LocalComercial(2017, "Calle Aceituna", 90,p8,500000,"Hola buenas");
        LocalIndustrial LI1 = new LocalIndustrial(2002,"Avenida Vinisiu", 350,p8,250000,"Elevado");

        Registro Lista_Registro = new Registro();

        Lista_Registro.addpropiedad(v1);
        Lista_Registro.addpropiedad(v2);
        Lista_Registro.addpropiedad(LC1);
        Lista_Registro.addpropiedad(LI1);

        v1.insertar_personas(p1);
        v1.insertar_personas(p2);
        v1.insertar_personas(p3);


        System.out.println(v1);

        v1.insertar_personas(p4);

        System.out.println(v1);


        Registro R1 = new Registro();
    }
}
