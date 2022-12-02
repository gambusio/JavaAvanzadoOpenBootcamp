import java.util.ArrayList;

/***
 * Ejercicio de los módulos 22, 23 y 24 del Curso de Java Avanzado #OpenBootcamp
 * - Crea una clase coche aplicándole el principio de responsabilidad única (S) ver Coche.java
 * - Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo
 *   aplicando el principio abierto/cerrado(O) ver CocheITV.java que añade comprobaciones de si
 *   tiene ITV en vigor
 * - Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno
 *   híbrido y aplica el principio de substitución de Liskov (L), las subclases deben ser
 *   sustituibles por la superclase coche ver CocheElectrico.java, CocheCombustion.java y CocheHibrido.java.
 *
 * @author Felipe González Hernández
 */

public class Main {
    /*
        Al cumplir el principio de substitución de Liskov podemos añadir al array coches cualquiera de
        las subclases indistintamente del tipo Coche, CocheElectrico, CocheCombustible o CocheHibrido
     */
    private final static ArrayList<Coche> coches = new ArrayList<>();

    public static void main(String[] args) {
        crearCoches();
        listarCoches();
        coches.get(0).acelerar(1);
        System.out.println("Coche 0 esta parado: " + coches.get(0).estaParado());
        System.out.println("Coche 1 esta parado: " + coches.get(1).estaParado());

        //Test de las extensiones Electrico-Combustible-CocheHibrido
        coches.get(0).setCarga(1.45f);
        coches.get(0).setNivelCombustible(20.12f);
        System.out.println("Nivel de carga: " + coches.get(0).getCarga() + " kWh");
        System.out.println("Nivel de combustible: " + coches.get(0).getNivelCombustible() + " l");

        //Test de la extensión CocheITV
        CocheITV cocheITV = new CocheITV();
        cocheITV.setsFechaItv("31-12-2022");
        if (cocheITV.ItvEnVigor()) {
            System.out.println("La ITV está en vigor");
        } else {
            System.out.println("La ITV está caducada");
        }

    }

    public static void crearCoches() {
        creaCoche("Seat", "Ibiza", "8989NJN", 3);
        creaCoche("Skoda", "Fabia", "1111BBB", 5);
        creaCoche("Mercedes", "A", "3333GGG", 3);
        creaCoche("Toyota", "Prius", "4444KLK", 5);
    }

    public static void creaCoche(String sMarca, String sModelo, String sMatricula, int iNumPuertas)  {
        Coche coche = new CocheHibrido();   // Coche, CocheElectrico, CocheHibrido, CocheCombustible
        coche.setsMarca(sMarca);
        coche.setsModelo(sModelo);
        coche.setsMatricula(sMatricula);
        coche.setiNumPuertas(iNumPuertas);
        coches.add(coche);
    }

    public static void listarCoches() {
        for (Coche coche :
             coches) {
            System.out.println(coche);
        }
    }
}