package com.rickandmortyapi;

import com.rickandmortyapi.model.Apis;
import com.rickandmortyapi.model.Metodos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opcao;
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
        System.out.println("Deseja Treinar antes da batalhar? ");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        int resposta = ler.nextInt();
        int forcaAdiconal = random.nextInt(30);
        int poderPerdido = random.nextInt(30);
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("Escolha um numero (1-28) para definir sua sorte no treino: ");
            int opcaoTreino = ler.nextInt();
            Metodos metodos = new Metodos();
            if (opcaoTreino == 1) {
                metodos.jerry(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 2) {
                metodos.morty(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 3) {
                metodos.snuffles(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 4) {
                metodos.rickMulti(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 5) {
                metodos.rick(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 6) {
                metodos.treino(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 7) {
                metodos.meeseeksFalha(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 8) {
                metodos.entidadeEngana(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 9) {
                metodos.portalCronenbergs(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 10) {
                metodos.jerryDestroi(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 11) {
                metodos.naveAvaria(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 12) {
                metodos.gazorpazorpianosFuriosos(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 13) {
                metodos.birdperson(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 14) {
                metodos.meeseeksSucesso(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 15) {
                metodos.unity(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 16) {
                metodos.councilOfRicks(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 17) {
                metodos.interdimensionalTrap(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 18) {
                metodos.zigerionScam(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 19) {
                metodos.portalMalFuncionamento(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 20) {
                metodos.jerryInterrupts(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 21) {
                metodos.interdimensionalAlliance(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 22) {
                metodos.intergalacticChampion(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 23) {
                metodos.ancientArtifact(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 24) {
                metodos.meeseeksHelp(forcaAdiconal);
                forcaPerso += forcaAdiconal;
            } else if (opcaoTreino == 25) {
                metodos.realityCronenberg(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 26) {
                metodos.federationCapture(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 27) {
                metodos.plutonianScam(poderPerdido);
                forcaPerso -= poderPerdido;
            } else if (opcaoTreino == 28) {
                metodos.toxicDimension(poderPerdido);
                forcaPerso -= poderPerdido;
            } else {
                System.out.println("Opção inválida");
            }

            System.out.println("Força atual: " + forcaPerso);

            System.out.println("----------------------------------------------------------");
            System.out.println("Deseja batalhar? ");
            System.out.println("1- Sim");
            System.out.println("2- Não");
             opcao = ler.nextInt();

            if (opcao == 1) {
                if (forcaPerso >= forcaInimigo) {
                    System.out.println("Voce é o ganhador e o novo chefe dessa dimensão, Parabens!");
                } else {
                    System.out.println("Voce perdeu,a força do oponente era de " + forcaInimigo + " ,tente novamente");
                }
            } else if (opcao == 2) {
                System.out.println("Vamos tentar novamente....");
            } else {
                System.out.println("Resposta errada");
            }

        }while (opcao == 2) ;
    }
}
