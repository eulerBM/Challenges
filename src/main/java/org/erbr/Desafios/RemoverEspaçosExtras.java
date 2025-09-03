package org.erbr.Desafios;

public class RemoverEspaçosExtras {


    public static void remove(String texto){

        texto = texto.trim();

        texto.replaceAll("\\s+", " ");

        System.out.println(texto);


    }
}
