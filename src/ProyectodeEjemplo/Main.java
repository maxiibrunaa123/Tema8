package ProyectodeEjemplo;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinusc= cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cadenaMinusc);
        String cadenaMayusc= cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cadenaMayusc);

        boolean resultado = cadena.startsWith("men");

        if (resultado) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }

        boolean resultadofinal = cadena.endsWith("o");

        if (resultadofinal) {
            System.out.println("Si acaba");
        } else {
            System.out.println("No acaba");
        }

        char letra = cadena.charAt(4);
        System.out.println("Caracter es: " + letra);

        for (int i = 0 ; i < cadena.length(); i++){
            System.out.println("Caracter actual es :" + cadena.charAt(i));
        }
    }
}
