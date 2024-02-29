package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        sc.nextLine();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        Champion firstChampion = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        sc.nextLine();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        Champion secondChampion = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.print("Quantos turnos voce deseja executar? ");
        int n = sc.nextInt();
        System.out.println();

        for(int i = 0; i < n; i++) {
            if(firstChampion.life < 1 || secondChampion.life < 1) {
                break;
            }
            else {
                firstChampion.takeDamage(secondChampion);
                secondChampion.takeDamage(firstChampion);
                System.out.println("Resultado do turno " + (i + 1) + ": ");
                System.out.println(firstChampion.status());
                System.out.println(secondChampion.status());
                System.out.println();
            }
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}