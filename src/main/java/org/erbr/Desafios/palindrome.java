package org.erbr.Desafios;

public class palindrome {


    public static boolean palindrome(String text){

        String textInvertido = "";

        for (int i = text.length() - 1; i >= 0; i--){

            char textIndice = text.charAt(i);

            textInvertido += textIndice;

        }

        if (text.equals(textInvertido)){

            System.out.println("É um palindrome");
            return true;
        }

        System.out.println("Não é um palindrome");
        return false;

    }
}
