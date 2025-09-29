package org.erbr.Desafios;

import java.util.List;

public class MaiorOuMenorDeUmaListaInt {

    public static void make(List<Long> nums) {
        long maiorNumero = nums.get(0);
        long menorNumero = nums.get(0);

        for (Long number : nums) {
            if (number > maiorNumero) {
                maiorNumero = number;
            }
            if (number < menorNumero) {
                menorNumero = number;
            }
        }

        System.out.println("O maior número da lista é: " + maiorNumero);
        System.out.println("O menor número da lista é: " + menorNumero);
    }

}
