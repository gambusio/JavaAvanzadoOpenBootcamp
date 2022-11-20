public class Main {
    public static void main(String[] args) {
        Reloj relojDelSistema = Reloj.getInstance();

        System.out.println("Hi, today is " + relojDelSistema.getDateString());

    }
}