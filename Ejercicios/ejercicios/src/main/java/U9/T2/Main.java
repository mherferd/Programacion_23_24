package U9.T2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ADClassicModels PRUEBA = new ADClassicModels();
        List<Employee> Lista = PRUEBA.getEmpleados();

        for (int i=0; i<Lista.size(); i++){
            System.out.println(Lista.get(i));
        }


        System.out.println("--------------------------------------------------");

        List<Office> Lista2 = PRUEBA.getOffices();

        for (int i=0; i<Lista2.size(); i++){
            System.out.println(Lista2.get(i));
        }


    }
}
