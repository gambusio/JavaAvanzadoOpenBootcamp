import java.util.ArrayList;

public interface DatabaseStore {

    void guardarRegistro(CocheImpl coche);
    ArrayList<CocheImpl> listarRegistros();
}
