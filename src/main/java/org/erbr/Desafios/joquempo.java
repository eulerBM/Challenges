package org.erbr.Desafios;

import org.erbr.Desafios.Enums.BodyEnum;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class joquempo {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main() {

        while (true) {

            System.out.println("--- Seja bem vindo, ao jogo Pedra, Papel e Tesoura ---");
            System.out.println("Escolha:");
            System.out.println("0 = Pedra");
            System.out.println("1 = Papel");
            System.out.println("2 = Tesoura");

            System.out.print("Eschola: ");

            int jogadorEscolha = Integer.parseInt(input.next());

            var player = BodyEnum.values()[jogadorEscolha];

            if (jogadorEscolha >= 3) {

                System.out.println("Valor informado incorreto!");
                break;

            }

            BodyEnum changeMachine = Arrays.stream(BodyEnum.values())
                            .skip(ThreadLocalRandom.current().nextInt(BodyEnum.values().length))
                                    .findFirst()
                                            .orElseThrow();

            System.out.println("Player escolha: " + player);
            System.out.println("Escolha da maquina: " + changeMachine);

            if (player == changeMachine){

                System.out.println("Empate!");
                break;

            }

            if (player == BodyEnum.PEDRA && changeMachine == BodyEnum.TESOURA){
                System.out.println("Player Ganhou");
                break;
            }
            if (player == BodyEnum.PAPEL && changeMachine == BodyEnum.PEDRA){
                System.out.println("Player Ganhou");
                break;
            }
            if (player == BodyEnum.TESOURA && changeMachine == BodyEnum.PAPEL){
                System.out.println("Player Ganhou");
                break;
            }

            System.out.println("Maquina ganhou");

        }
    }
}