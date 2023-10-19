package fr.dampierre;

import java.util.Random;
// import java.util.concurrent.TimeUnit;
// import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int nbLancer;
        int numeroCase = 0;
        int casesRestantes;
        Random generateur = new Random();
        for (nbLancer = 0; nbLancer < 5; nbLancer++) {
            while (nbLancer <= 5) {
                int lancer = generateur.nextInt(6) + 1;
                numeroCase += lancer;
                casesRestantes = 20 - numeroCase;
                nbLancer += 1;
                System.out.println("Lancer " + nbLancer + " : vous avez fait " + lancer + ". Vous êtes sur la case "
                        + numeroCase + " (encore " + casesRestantes + " cases).");
            }
            if (numeroCase == 20) {
                System.out.println("Vous avez gagné !");
            } else {
                System.out.println("Vous avez perdu...");
            }

            // if (numeroCase == 20) {
            // System.out.println("Lancer " + nbLancer + " : vous avez fait " + lancer + ".
            // Vous êtes sur la case "
            // + numeroCase + ".");
            // System.out.println("Vous avez gagné !");
            // } else {
            // casesRestantes = 20 - numeroCase;
            // System.out.println("Lancer " + nbLancer + " : vous avez fait " + lancer + ".
            // Vous êtes sur la case "
            // + numeroCase + " (encore " + casesRestantes + " cases).");
            // }
            // Scanner clavier = new Scanner(System.in);

            // TimeUnit.SECONDS.sleep(1);
        }

        // int lancer = generateur.nextInt(6) + 1;

        // numeroCase += lancer;
        // nbLancer += 1;
        // System.out.println("Lancer ");
        // if (numeroCase == 20) {

    }
}

// Lancer 1 : vous avez fait ??. Vous êtes sur la case ?? (encore ?? cases).
// Vous avez gagné !
