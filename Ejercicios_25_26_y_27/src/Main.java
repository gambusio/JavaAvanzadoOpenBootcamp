public class Main {
    public static void main(String[] args) {

        DatabaseStore cochesDB = new DatabaseArray();
        crearCoches(cochesDB);
        listarCoches(cochesDB);
    }

    /*Test para introducir coches al almacenamiento */
    public static void crearCoches(DatabaseStore cochesDB) {
        creaCoche("Seat", "Ibiza", "8989NJN", 3, cochesDB);
        creaCoche("Skoda", "Fabia", "1111BBB", 5, cochesDB);
        creaCoche("Mercedes", "A", "3333GGG", 3, cochesDB);
        creaCoche("Toyota", "Prius", "4444KLK", 5, cochesDB);
    }

    public static void creaCoche(String sMarca, String sModelo, String sMatricula, int iNumPuertas, DatabaseStore cochesDB)  {
        CocheImpl coche = new CocheImplHibrido();   // Coche, CocheElectrico, CocheHibrido, CocheCombustible
        coche.setsMarca(sMarca);
        coche.setsModelo(sModelo);
        coche.setsMatricula(sMatricula);
        coche.setiNumPuertas(iNumPuertas);
        cochesDB.guardarRegistro(coche);
    }

    public static void listarCoches(DatabaseStore cochesDB) {
        for (Coche coche :
                cochesDB.listarRegistros()) {
            System.out.println(coche);
        }
    }
}