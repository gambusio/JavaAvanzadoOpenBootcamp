public class CocheImplCombustible extends CocheImpl {
    private float fNivelCombustible;

    @Override
    public float getNivelCombustible() {
        return fNivelCombustible;
    }

    @Override
    public void setNivelCombustible(float fIncremento) {
        fNivelCombustible += fIncremento;
    }
}
