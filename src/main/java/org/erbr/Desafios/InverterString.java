package org.erbr.Desafios;

public class InverterString {

    public static void inverter(String texto){

        String textoInvertido = "";

        for (int i = texto.length() -1; i >=0; i--){

            String letter = String.valueOf(texto.charAt(i));

            textoInvertido += letter;

        }

        System.out.println("Texto normal: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);

    }
}
