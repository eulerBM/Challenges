package org.erbr.Desafios;

import java.util.HashSet;
import java.util.Set;

public class ChecarStringApenasDígitos {


    public static void onlyString(String texto){

        Set<String> numeros = new HashSet<>();

        for (int u = 0; u <= 10; u++){
            numeros.add(String.valueOf(u));
        }

        for (int i = 0; i <= texto.length() - 1; i++){
            String letter = String.valueOf(texto.charAt(i));

            if (!numeros.contains(letter)){
                System.out.println("False: uma letra foi detectada: "+letter);
                break;
            }
        }
    }
}
