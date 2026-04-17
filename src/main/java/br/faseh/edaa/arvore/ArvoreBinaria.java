package br.faseh.edaa.arvore;

/**
 * Classe que representa a árvore binária.
 * toDo (Aqui você deve criar o método para inserir os elementos na árvore)
 */
public class ArvoreBinaria {

    private NoBinario raiz;

    /**
     * ToDo (crie um método recursivo para a inserção de
     * elementos na árvore binária (método privado)
     */

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private NoBinario inserirRecursivo(NoBinario atual, int valor) {
        if (atual == null) {
            return new NoBinario(valor);
        }

        if (valor < atual.getNumero()) {
            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), valor));
        }

        else if (valor > atual.getNumero()) {
            atual.setDireita(inserirRecursivo(atual.getDireita(), valor));
        }

        return atual;
    }
    public void exibirEmOrdem() {
        exibirPosOrdemRecursivo(raiz);
    }

    private void exibirPosOrdemRecursivo(NoBinario atual) {
        if (atual != null) {
            exibirPosOrdemRecursivo(atual.getEsquerda());
            System.out.print(atual.getNumero() + " ");
            exibirPosOrdemRecursivo(atual.getDireita());
        }
    }
}
