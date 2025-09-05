package org.erbr.Desafios;

public class CompactarString {

    public static void compact(String texto){

        String textoCompact = "";

        int count = 0;

        for (int i = 0; i <= texto.length() - 1; i++){

            String letter = String.valueOf(texto.charAt(i));

            count = 0;
            for (int u = 0; u <= texto.length() -1; u++){
                String letterIn = String.valueOf(texto.charAt(u));



                if (letter.equals(letterIn)){
                    count++;

                }

                if (u == texto.length() -1){

                    if (textoCompact.contains(letter)){
                        continue;
                    }

                    textoCompact += letter;
                    textoCompact += count;


                }

            }

        }

        System.out.println(textoCompact);


    }
}
