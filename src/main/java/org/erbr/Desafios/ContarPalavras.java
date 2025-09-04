package org.erbr.Desafios;

public class ContarPalavras {

    public static void contar(String texto){

        texto = texto.trim();

        int count = 0;

        for (int i = 0; i <= texto.length() -1; i++){
            String letter = String.valueOf(texto.charAt(i));

            if (letter.equals(" ")){
                count++;

            }

            if (texto.length() -1 == i){
                count++;
            }

        }

        System.out.println(count);
    }
}
