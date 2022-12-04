public class CocheImplHibrido extends CocheImpl implements CocheElectrico, CocheMotor{
    private float fCarga;
    private float fNivelCombustible;

    @Override
    public float getCarga() {
        return fCarga;
    }

    @Override
    public void setCarga(float fIncremento) {
        fCarga += fIncremento;
    }

    @Override
    public float getNivelCombustible() {
        return fNivelCombustible;
    }

    @Override
    public void setNivelCombustible(float fIncremento) {
        fNivelCombustible += fIncremento;
    }
}
