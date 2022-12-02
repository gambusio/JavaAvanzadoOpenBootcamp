public class CocheCombustible extends Coche {
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
