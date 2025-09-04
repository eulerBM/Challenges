package org.erbr.Desafios;

import java.util.HashMap;
import java.util.Map;

public class EncontrarCaractereRepetido {


    public static void procurar(String texto) {

        Map<Character, Integer> contador = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            contador.put(letra, contador.getOrDefault(letra, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Caractere '" + entry.getKey() + "' repetido " + entry.getValue() + " vezes.");
            }
        }
    }
}
