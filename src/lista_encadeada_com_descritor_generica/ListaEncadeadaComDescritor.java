package lista_encadeada_com_descritor_generica;

public class ListaEncadeadaComDescritor<T> implements Lista {

    private Descritor<T> descritor;

    public ListaEncadeadaComDescritor() {
        descritor = new Descritor<>();
    }

    public int getTamanhoDescritor() {
        return descritor.tamanho;
    }

    public T getInicioDescritor() {
        return descritor.inicio.getDado();
    }

    public T getFimDescritor() {
        return descritor.fim.getDado();
    }

    @Override
    public void inserirNoFinal(int dado) {

        No no = new No(dado);

        if (isVazio()) {
            descritor.inicio = no;
            descritor.fim = no;
            descritor.tamanho++;
            return;
        }

        descritor.fim.setProximo(no);
        descritor.fim = no;
        descritor.tamanho++;
    }

    @Override
    public void removerNoFinal() {

        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        No aux = descritor.inicio;

        for (int i = 0; i < descritor.tamanho - 2; i++) {
            aux = aux.getProximo();
        }

        aux.setProximo(null);
        descritor.fim = aux;
        descritor.tamanho--;
    }

    @Override
    public void imprimir() {
        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        No aux = descritor.inicio;

        while (aux != null) {
            System.out.print(aux.getDado() + " ");
            aux = aux.getProximo();
        }
    }

    @Override
    public boolean isVazio() {
        return descritor.inicio == null;
    }
}
