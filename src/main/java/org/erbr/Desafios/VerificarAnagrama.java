package org.erbr.Desafios;

import java.util.Arrays;

public class VerificarAnagrama {
    static boolean isAnagrama = true;

    public static boolean verificar(String texto1, String texto2){

        if (texto1.length() != texto2.length()) {
            return false;
        }

        char[] arr1 = texto1.toLowerCase().toCharArray();
        char[] arr2 = texto2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}
