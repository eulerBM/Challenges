package org.erbr.Desafios;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraLetraMaiúscula {


    public static void make(String texto){

        String textoPronto = "";

        List<Integer> incrementUpper = new ArrayList<>();


        for (int i = 0; i <= texto.length() - 1; i++){
            String textIndice = String.valueOf(texto.charAt(i));

            if (textIndice.equals(" ")){
                incrementUpper.add(i+1);
            }
        }

        boolean pass = false;

        System.out.println(incrementUpper);

        for (int i = 0; i <= texto.length() -1; i++){
            String textIndice = String.valueOf(texto.charAt(i));
            pass = false;

            if (i == 0){

                textoPronto += textIndice.toUpperCase();
                pass = true;
            }

            for (int numero : incrementUpper) {
                if (numero == i) {
                    textoPronto += textIndice.toUpperCase();
                    pass = true;

                }

            }
            if (pass){
                continue;
            }
            textoPronto += textIndice;

        }

        System.out.println(textoPronto);
    }
}
