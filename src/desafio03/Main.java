package desafio03;

import java.util.Scanner;

public class Main {

    private static final Agenda agenda = new Agenda();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha = -1;

        while (escolha != 0) {
            System.out.println("1 - Adicionar novo contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contatos por nome");
            System.out.println("0 - Finalizar");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1 : agenda.adicionarContato(criarContato(sc));
                break;
                case 2 : agenda.listarContatos();
                break;
                case 3 :
                    System.out.println("Informe o nome do contato: ");
                    String nomeContato = sc.next();
                    System.out.println(agenda.buscarContatoPorNome(nomeContato));
                    break;
                default:
                    System.out.println("Escolha inválida");
            }
        }
    }

    static Contato criarContato(Scanner sc) {

        System.out.println("Informe o nome do contato: ");
        String nome = sc.next();

        System.out.println("Informe o telefone: ");
        String telefone = sc.next();

        System.out.println("Informe o email: ");
        String email = sc.next();

        return new Contato(nome, telefone, email);
    }
}
