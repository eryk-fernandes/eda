package fila_encadeada;

public class FilaEncadeada implements Fila {

    private No inicio;

    @Override
    public void inserir(int dado) {

        No no = new No(dado);

        if (isVazio()) {
            inicio = no;
            return;
        }

        No aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }

        aux.setProximo(no);
    }

    @Override
    public void remover() {

        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        inicio = inicio.getProximo();
    }

    @Override
    public boolean isVazio() {
        return inicio == null;
    }

    @Override
    public int buscar(int dado) {
        return 0;
    }

    @Override
    public int quantidade() {
        return 0;
    }

    @Override
    public void imprimir() {
        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        No aux = inicio;

        while (aux != null) {
            System.out.print(aux.getDado() + " ");
            aux = aux.getProximo();
        }
    }
}
