package org.erbr.Desafios;

import java.util.ArrayList;
import java.util.List;

public class ContarVogaisEConsoantes {


    public static void contar(String texto){

        List<String> vogais = new ArrayList<>();

        vogais.add("a");
        vogais.add("e");
        vogais.add("i");
        vogais.add("o");
        vogais.add("u");

        int countVogais = 0;
        int countConsoante = 0;

        for (int i = texto.length() - 1; i >= 0; i--){

            String letter = String.valueOf(texto.charAt(i));

            if (vogais.contains(letter)){
                countVogais++;


            } else {

                countConsoante++;
            }
        }

        System.out.println("Vogais: " + countVogais);
        System.out.println("Consoantes: " + countConsoante);
    }
}
