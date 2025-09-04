package org.erbr.Desafios;

public class SubstringManual {

    public static void substringIn(int inicio, int fim, String texto){

        String textoPronto = "";

        for (int i =inicio; i <= texto.length() -1; i++){
            String text = String.valueOf(texto.charAt(i));

            if (i == fim){
                break;
            }

            textoPronto += text;

        }

        System.out.println(textoPronto);
    }
}
