package org.erbr.Desafios;

public class PrimeiroCaractereNãoRepetido {

    public static String make(String texto){
        int count = 0;

        for (int i = 0; i <= texto.length() -1; i++){
            String letter = String.valueOf(texto.charAt(i));

            int repeat = 0;

            for (int u = 0; u <= texto.length() -1; u++){
                String letterIn = String.valueOf(texto.charAt(u));

                if (letter.equals(letterIn)){

                    if (i != u){

                        repeat = 1;

                    }
                }
                if (repeat == 1){
                    break;
                }
                if (u == texto.length() -1 && repeat == 0){
                    count++;
                    System.out.println(count+" letra que não se repete: "+ letter);
                }
            }
        }

        return "Nenhuma letra";
    }
}
