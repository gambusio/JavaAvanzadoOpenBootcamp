/**
 * Clase Main sencilla para testear la clase Reloj
 * Crea una instancia del tipo Reloj
 * Uso:
 *  reloj                 imprime la fecha de hoy
 *  reloj --mañana        imprime la fecha de mañana
 *  reloj --ayer          imprime la fecha de ayer
 */
public class Main {
    public static void main(String[] args) {
        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.registerOption("ayer");
        optionsParser.registerOption("mañana");
        optionsParser.parse();
        Reloj relojDelSistema = Reloj.getInstance();

        if (optionsParser.noArgs()) {
            System.out.println("Fecha del sistema: " + relojDelSistema.getDateString());
        } else {
            if (optionsParser.getOption("ayer")) {
                System.out.println("Fecha de ayer: " + relojDelSistema.getDateString("ayer"));
            } else if (optionsParser.getOption("mañana")) {
                System.out.println("Fecha de mañana: " + relojDelSistema.getDateString("mañana"));
            }
        }

    }
}