package desafio02;

import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {

        Animal leao = new Leao();
        Animal macaco = new Macaco();
        Animal cachorro = new Cachorro();

        Scanner sc = new Scanner(System.in);

        int escolha = -1;

        while (escolha != 0) {
            System.out.println("Quais animais deseja visitar?");
            System.out.println("1 - Leão");
            System.out.println("2 - Macaco");
            System.out.println("3 - Cachorro");
            System.out.println("0 - Finalizar");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1: leao.emitirSom();
                break;
                case 2: macaco.emitirSom();
                break;
                case 3: cachorro.emitirSom();
                break;
            }
        }
    }
}
