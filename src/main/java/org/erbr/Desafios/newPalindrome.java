package org.erbr.Desafios;

public class newPalindrome {


    public static void palin(String text){

        String textoInvertido = "";

        for (int i = text.length() -1; i >= 0; i--) {

            char letra = text.charAt(i);

            textoInvertido += letra;

        }

        if (textoInvertido.equals(text)){
            System.out.println("é uma palindrome!");
        } else {
            System.out.println("não é uma palindrome");
        }

    }
}
