package lista_encadeada_com_descritor;

public class ListaEncadeadaComDescritor implements Lista {

    private Descritor descritor;

    public ListaEncadeadaComDescritor() {
        descritor = new Descritor();
    }

    public int getTamanhoDescritor() {
        return descritor.tamanho;
    }

    public int getInicioDescritor() {
        return descritor.inicio.getDado();
    }

    public int getFimDescritor() {
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

        No aux = descritor.inicio;

        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }

        aux.setProximo(no);
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
            System.out.println("NO : " + aux.getDado());
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
