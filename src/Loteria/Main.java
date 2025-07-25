package Loteria;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configurações da loteria (exemplo: 6 números entre 1 e 60)
        Loteria loteria = new Loteria(6, 60);

        System.out.println("Digite seus 6 números entre 1 e 60:");

        Set<Integer> numerosJogador = new HashSet<>();
        while (numerosJogador.size() < 6) {
            System.out.print("Número " + (numerosJogador.size() + 1) + ": ");
            int num = scanner.nextInt();
            if (num < 1 || num > 60) {
                System.out.println("Número inválido! Deve ser entre 1 e 60.");
            } else if (numerosJogador.contains(num)) {
                System.out.println("Número já escolhido! Tente outro.");
            } else {
                numerosJogador.add(num);
            }
        }

        // Realiza o sorteio
        loteria.sortear();

        System.out.println("Números sorteados: " + loteria.getNumerosSorteados());

        // Verifica e exibe os acertos
        int acertos = loteria.verificarAcertos(numerosJogador);
        System.out.println("Você acertou " + acertos + " número(s).");

        scanner.close();
    }
}
