import java.util.Date;

public class Reloj {
    private static Reloj reloj;

    private Reloj() {}

    public static Reloj getInstance() {
        if (reloj == null) {
            reloj = new Reloj();
        }
        return reloj;
    }

    public String getDateString () {
        return new Date().toString();
    }
}
