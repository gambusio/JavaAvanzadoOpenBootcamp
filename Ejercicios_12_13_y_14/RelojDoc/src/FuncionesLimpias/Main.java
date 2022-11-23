package FuncionesLimpias;

import java.util.function.Consumer;

/**
 * Clase main que implementa dos funciones limpias para cifrar y descifrar cadenas usando un cifrado sencillo tipo
 * XOR, la clave es un byte así que no se trata de un sistema fuerte de cifrado.
 * cifrarCadena :: devuelve la cadena que se la pasa cifrada usando
 * descifraCadenas :: devulve las cadena descifrada usando
 */
public class Main {

    public static void main(String[] args) {
        String sMensaje = "Hola mundo bonito!";
        char cClave = 'X';
        String sTemp;

        sTemp = cifrarCadena(sMensaje, cClave);
        System.out.println("Mensaje cifrado \t= " + sTemp);
        sTemp = descifrarCadena(sTemp, cClave);
        System.out.println("Mensaje descifrado \t= " + sTemp);


    }

    private static String cifrarCadena(String sMensaje, char cClave) {
        final String[] sTextoCifrado = {""};

        // cifra una caracter con la clave lo añade a la cadena de salida
        Consumer<Character> cifrarCharConsumer = (c) -> {
            c = (char) (c ^ cClave);
            sTextoCifrado[0] += c;
        };

        sMensaje.chars().mapToObj(i -> (char) i).forEach(cifrarCharConsumer);
        return sTextoCifrado[0];
    }

    private static String descifrarCadena(String sMensaje, char cClave) {
        final String[] sTextoDescifrado = {""};

        // cifra una caracter con la clave pasada y lo añade a la cadena de salida
        Consumer<Character> descifrarCharConsumer = (c) -> {
            c = (char) (c ^ cClave);
            sTextoDescifrado[0] += c;
        };

        sMensaje.chars().mapToObj(i -> (char) i).forEach(descifrarCharConsumer);
        return sTextoDescifrado[0];
    }





}
