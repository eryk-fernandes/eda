package lista_ligada;

public class ListaEncadeada implements Lista {

    No inicio;

    @Override
    public void inserirNoFinal(int dado) {

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
    public void inserirNoInicio(int dado) {
        No no = new No(dado);

        if (isVazio()) {
            inicio = no;
            return;
        }

        no.setProximo(inicio);
        inicio = no;
    }

    @Override
    public void inserir(int dado, int pos) {

        if (pos < 0 || pos > quantidade() - 1) {
            System.out.println("Posição invalida");
            return;
        }

        No no = new No(dado);

        if (isVazio()) {
            inicio = no;
            return;
        }

        if (pos == 0) {
            no.setProximo(inicio);
            inicio = no;
            return;
        }

        No aux = inicio;

        for (int i = 1; i < pos; i++) {
            aux = aux.getProximo();
        }

        no.setProximo(aux.getProximo());
        aux.setProximo(no);
    }

    @Override
    public int buscar(int dado) {

        if (isVazio()) {
            System.out.println("Lista vazia");
            return -1;
        }

        No aux = inicio;

        for (int i = 0; i < quantidade(); i++) {
            if (aux.getDado() == dado) {
                return i;
            }
            aux = aux.getProximo();
        }

        return -1;
    }

    @Override
    public void remover(int pos) {
        if (isVazio()) {
            System.out.println("Lista vazia");
        }

        No aux = inicio;

        for (int i = 0; i < pos; i++) {
            aux = aux.getProximo();
        }

        aux.setProximo(null);
    }

    @Override
    public void removerNoFinal() {

        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        No aux = inicio;

        for (int i = 0; i < quantidade() - 2; i++) {
            aux = aux.getProximo();
        }

        aux.setProximo(null);
    }

    @Override
    public void removerNoInicio() {
        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        inicio = inicio.getProximo();
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

    @Override
    public int quantidade() {
        No aux = inicio;

        int quantidade = 0;

        while (aux != null) {
            quantidade++;
            aux = aux.getProximo();
        }

        return quantidade;
    }

    @Override
    public boolean isVazio() {
        return inicio == null;
    }
}
