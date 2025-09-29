package org.erbr;

import org.erbr.Desafios.MaiorOuMenorDeUmaListaInt;
import org.erbr.Desafios.SomarTodosInts;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Long> nums = new ArrayList<>();

        nums.add(7L);
        nums.add(9L);
        nums.add(3L);
        nums.add(2L);
        nums.add(1L);
        nums.add(4L);

        MaiorOuMenorDeUmaListaInt.make(nums);

    }
}