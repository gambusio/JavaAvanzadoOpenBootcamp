public class CocheImpl implements Coche {
    private String sMarca;
    private String sModelo;
    private String sMatricula;
    private int iNumPuertas;
    private int iVelocidad;

    public void acelerar(int iIncremento) {
        iVelocidad = iVelocidad + iIncremento;
    }

    public boolean estaParado() {
        return iVelocidad == 0;
    }

    public String getsMarca() {
        return sMarca;
    }

    public void setsMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public String getsModelo() {
        return sModelo;
    }

    public void setsModelo(String sModelo) {
        this.sModelo = sModelo;
    }

    public String getsMatricula() {
        return sMatricula;
    }

    public void setiNumPuertas(int iNumPuertas) {
        this.iNumPuertas = iNumPuertas;
    }

    @Override
    public String toString() {
        return "Marca: " + sMarca + " Modelo: " + sModelo + "\r\n"
                + "Matricula: " + sMatricula + " Puertas: " + iNumPuertas + "\r\n"
                + "Velociad: " + iVelocidad;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    /*
    public float getCarga() { return 0; }
    public float getNivelCombustible() { return 0; }
    public void setCarga(float fIncremento) {}
    public void setNivelCombustible(float fIncremento) {}*/
}
