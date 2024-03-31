package com.rickandmortyapi;

import com.rickandmortyapi.model.Apis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idPersonagem = 0;
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        var apis = new Apis();
            System.out.println("Digite um número entre 1 e 826: ");
            idPersonagem = ler.nextInt();
            int forcaPerso = random.nextInt(100);
            System.out.println(apis.personagem(String.valueOf(idPersonagem)));
            System.out.println("-- Sua força é de: " + forcaPerso);
            System.out.println("----------------------------------------------------------");

            int numeroAleatorio = random.nextInt(826);
            int lugar = random.nextInt(126);

            System.out.println("Seu adversário será: ");
            System.out.println(apis.personagem(String.valueOf((numeroAleatorio))));
            System.out.println("Força secreta");
            int forcaInimigo = random.nextInt(95);
            System.out.println("----------------------------------------------------------");
        System.out.println("Sua batalha sera aqui: ");
        System.out.println(apis.lugar(String.valueOf((lugar))));
        System.out.println("----------------------------------------------------------");
            System.out.println("Deseja batalhar: ");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            int resposta = ler.nextInt();

            if (resposta == 1) {
                if (forcaPerso >= forcaInimigo) {
                    System.out.println("Voce é o ganhador e o novo chefe dessa dimensão, Parabens!");
                } else {
                    System.out.println("Voce perdeu,a força do oponente era de " + forcaInimigo+ " ,tente novamente");
                }
            } else if (resposta == 2) {
                System.out.println("Voce iria perder mesmo...");
            } else {
                System.out.println("Resposta errada");
            }
        }
    }
