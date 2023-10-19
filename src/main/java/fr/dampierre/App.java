package fr.dampierre;

import java.util.Random;
// import java.util.concurrent.TimeUnit;
// import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int nbLancer = 0;
        int numeroCase = 0;
        int casesRestantes;
        Random generateur = new Random();
        while (numeroCase != 20) {
            nbLancer += 1;
            int lancer = generateur.nextInt(6) + 1;
            numeroCase += lancer;
            casesRestantes = Math.abs(20 - numeroCase);

            System.out.println("Lancer " + nbLancer + " : vous avez fait " + lancer + ". Vous êtes sur la case "
                    + numeroCase + " encore " + casesRestantes + " cases).");
            try {
                Thread.sleep(250); // attendre 0.25 seconde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Vous avez gagné en " + nbLancer + " lancers.");
    }
}

//

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

// int lancer = generateur.nextInt(6) + 1;

// numeroCase += lancer;
// nbLancer += 1;
// System.out.println("Lancer ");
// if (numeroCase == 20) {

// Lancer 1 : vous avez fait ??. Vous êtes sur la case ?? (encore ?? cases).
// Vous avez gagné !
