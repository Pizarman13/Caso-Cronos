package org.example;

public class ComunicadorInterplanetario {

    public int contarVocales(String mensaje) {
        int contador = 0;
        for (char c : mensaje.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirMensaje(String mensaje) {
        StringBuilder invertido = new StringBuilder();

        for (int i = mensaje.length() - 1; i >= 0; i--) {
            invertido.append(mensaje.charAt(i));
        }
        return invertido.toString();

    }

    public boolean esPalindromo(String mensaje) {

        String mensajeSinEspacios = mensaje.replaceAll("\\s+", "").toLowerCase();
        int longitud = mensajeSinEspacios.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (mensajeSinEspacios.charAt(i) != mensajeSinEspacios.charAt(longitud - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
