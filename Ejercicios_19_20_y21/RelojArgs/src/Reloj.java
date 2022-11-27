import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Clase que implementa el reloj del sistema utilizando el patron <i>singleton</i>
 *
 * @author gambusio
 *
 * @see  <a href="https://es.wikipedia.org/wiki/Singleton">Singleton Pattern Wikipedia Entry</a>
 */
public class Reloj {
    private static Reloj reloj;

    private Reloj() {}

    /**
     * Si aún no existía la instancia del tipo Reloj crea una nueva, en caso contrario devuelve el objeto previamente
     * instanciado.
     *
     * @return Instancia del tipo Reloj
     */
    public static Reloj getInstance() {
        if (reloj == null) {
            reloj = new Reloj();
        }
        return reloj;
    }

    /**
     *
     * Devuelve en formato String la fecha y hora del sistema
     *
     * @return Cadena con la fecha del sistema
     */
    public String getDateString () {
        return new Date().toString();
    }

    /**
     *
     * Devuelve en formato String la fecha y hora de ayer o de mañana según parámetro pasado
     *
     * @return Cadena con la fecha del sistema
     */
    public String getDateString (String sDia) {
        Date temp = new Date();
        if (sDia.equalsIgnoreCase("ayer")) {
            return new Date(temp.getTime() +  TimeUnit.DAYS.toMillis( -1 )).toString();
        } else if (sDia.equalsIgnoreCase("mañana")){
            return new Date(temp.getTime() +  TimeUnit.DAYS.toMillis( 1 )).toString();
        } else {
            return temp.toString();
        }
    }
}
