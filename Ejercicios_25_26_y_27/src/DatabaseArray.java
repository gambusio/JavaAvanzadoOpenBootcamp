import java.util.ArrayList;

public class DatabaseArray implements DatabaseStore {
    ArrayList<CocheImpl> coches = new ArrayList<>();
    @Override
    public void guardarRegistro(CocheImpl coche) {
        coches.add(coche);
    }

    @Override
    public ArrayList<CocheImpl> listarRegistros() {
        return coches;
    }
}
