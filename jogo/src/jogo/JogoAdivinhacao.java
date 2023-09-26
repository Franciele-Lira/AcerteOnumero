package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao Jogo de Adivinhação, é bom te ver aqui!");
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 10) {
            System.out.println("Desculpe, você não pode jogar porque é menor de 10 anos.");
            }

        int numeroComputador = random.nextInt(20) + 1;
        int tentativas = 0;

        System.out.println("Certo, " + nome + "! Você tem " + idade + " anos, então vamos para as instruções do jogo.");
        System.out.println("Vou escolher um número de 1 a 20, e você deve adivinhar qual é.");

        while (true) {
            System.out.println("Agora me diga se você quer:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Desistir");
            System.out.println("3 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite seu palpite (1 a 20): ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite < 1 || palpite > 20) {
                    System.out.println("Por favor, escolha um número entre 1 e 20.");
                } else if (palpite < numeroComputador) {
                    System.out.println("Tente um número maior.");
                } else if (palpite > numeroComputador) {
                    System.out.println("Tente um número menor.");
                } else {
                    System.out.println("Parabéns, você acertou o número " + numeroComputador + " em " + tentativas + " tentativas!");
                    break;
                }
            } else if (escolha == 2) {
                System.out.println("Você desistiu. O número era " + numeroComputador + ".");
                break;
            } else if (escolha == 3) {
                System.out.println("Obrigado por jogar!");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
            }
        }

        scanner.close();
    }
}
