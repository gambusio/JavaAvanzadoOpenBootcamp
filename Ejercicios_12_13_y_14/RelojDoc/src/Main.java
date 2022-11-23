/**
 * Clase Main sencilla para testear la clase Reloj
 * Crea una instancia del tipo Reloj y usando su método getDateString
 * muestra la hora y fecha del sistema
 */
public class Main {
    public static void main(String[] args) {
        Reloj relojDelSistema = Reloj.getInstance();

        System.out.println("Hi, today is " + relojDelSistema.getDateString());

    }
}