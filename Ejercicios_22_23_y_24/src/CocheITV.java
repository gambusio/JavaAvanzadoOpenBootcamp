
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CocheITV extends Coche {
    public String sFechaItv;

    public String getsFechaItv() {
        return sFechaItv;
    }

    public void setsFechaItv(String sFechaItv) {
        this.sFechaItv = sFechaItv;
    }

    public boolean ItvEnVigor() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate fecha1 = LocalDate.parse(sFechaItv, formatter);
        return fecha1.isAfter(LocalDate.now());
    }

}
