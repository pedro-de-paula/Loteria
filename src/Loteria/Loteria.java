package Loteria;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Loteria {
    private Set<Integer> numerosSorteados;
    private final int quantidadeNumeros;
    private final int limiteNumero;

    public Loteria(int quantidadeNumeros, int limiteNumero) {
        this.quantidadeNumeros = quantidadeNumeros;
        this.limiteNumero = limiteNumero;
        this.numerosSorteados = new HashSet<>();
    }

    // Gera números aleatórios únicos para o sorteio
    public void sortear() {
        numerosSorteados.clear();
        Random rand = new Random();
        while (numerosSorteados.size() < quantidadeNumeros) {
            int numero = rand.nextInt(limiteNumero) + 1; // de 1 até limiteNumero
            numerosSorteados.add(numero);
        }
    }

    // Verifica quantos números o jogador acertou
    public int verificarAcertos(Set<Integer> numerosJogador) {
        int acertos = 0;
        for (int numero : numerosJogador) {
            if (numerosSorteados.contains(numero)) {
                acertos++;
            }
        }
        return acertos;
    }

    public Set<Integer> getNumerosSorteados() {
        return numerosSorteados;
    }
}

