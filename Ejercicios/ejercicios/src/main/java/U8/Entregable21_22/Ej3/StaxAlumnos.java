package U8.Entregable21_22.Ej3;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.util.Scanner;
public class StaxAlumnos {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\User\\Downloads\\Programacion_23_24\\Ejercicios\\ejercicios\\src\\main\\java\\U8\\Entregable21_22\\Ej3\\Alumno.xml"));

            int totalAlumnos = 0;
            int alumnosDireccion = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la dirección para buscar: ");
            String direccionBuscada = scanner.nextLine();
            boolean isDireccion = false;
            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("alumno")) {
                        totalAlumnos++;
                    }
                    if (startElement.getName().getLocalPart().equals("direccion")) {
                        isDireccion = true;
                    }
                } else if (xmlEvent.isCharacters()) {
                    Characters characters = xmlEvent.asCharacters();
                    if (isDireccion && characters.getData().equals(direccionBuscada)) {
                        alumnosDireccion++;
                    }
                    isDireccion = false;
                }
            }

            System.out.println("Total de alumnos: " + totalAlumnos);
            System.out.println("Alumnos que viven en " + direccionBuscada + ": " + alumnosDireccion);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
