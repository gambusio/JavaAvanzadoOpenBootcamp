public class CocheElectrico extends Coche {
    private float fCarga;

    @Override
    public float getCarga() {
        return fCarga;
    }

    @Override
    public void setCarga(float fIncremento) {
        fCarga += fIncremento;
    }
}
