package desafio01;

import java.util.Scanner;

public class CifraEstagiario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine().toUpperCase();

        frase = frase.replace("A", "@")
                .replace("E", "#")
                .replace("I", "!")
                .replace("O", "$")
                .replace("U", "%");

        System.out.println("Texto cifrado: " + frase);
    }
}
