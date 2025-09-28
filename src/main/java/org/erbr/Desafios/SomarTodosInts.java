package org.erbr.Desafios;


public class SomarTodosInts {

    public static void somar(int nums){
        int resul = 1;

        for (int i = 1; i <= nums; i++){

            System.out.println(i);

            resul *= i;
        }

        System.out.println("A soma de todos foi : " + resul);
    }
}
