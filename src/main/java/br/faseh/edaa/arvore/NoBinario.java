package br.faseh.edaa.arvore;


/**
 * Classe que representa cada nó da árvore binária.
 */
public class NoBinario {
    private int numero;
    private NoBinario direita;
    private NoBinario esquerda;

    public NoBinario(int numero) {
        this.numero = numero;
        this.direita = this.esquerda = null;
    }
}




