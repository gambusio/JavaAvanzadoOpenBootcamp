/*
    Entrega de ejercicios de las sesiones 15,16,17 y 18 del Curso de Java Avanzado de OpenBootcamp
    Se han implementado la gestión de las excepciones siguientes:
    - Arithmetic exception: tratando de realizar una división entre dos números y que uno sea 0
    - ArrayIndexOutOfBounds: con un array de 6 elementos, tratando de alcanzar el noveno elemento
    - FileNotFound: tratando de acceder a un fichero que no existe
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int POSICION = 9;
        int iValor;
        int[] iValores = {1, 2, 3, 4, 5, 6};

        String sFilename = "autoexec.bat";

        try {
            iValor = POSICION / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error calculando iValor: " + e.getMessage());
            iValor = POSICION;
        }

        try {
            System.out.println(iValores[iValor]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error mostrando valor en la posición seleccionada: " + e.getMessage());
        }

        try {
            Scanner data = new Scanner(new File(sFilename));
            System.out.println(data.next());
        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo fichero: " + e.getMessage());
        }
    }
}
