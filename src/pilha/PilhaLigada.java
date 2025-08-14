package pilha;

public class PilhaLigada {

    No topo;

    public void push(int dado) {

        No no = new No(dado);

        if (isVazio()) {
            topo = no;
            return;
        }

        no.setProximo(topo);
        topo = no;
    }

    public void pop() {

        if (isVazio()) {
            System.out.println("Lista vazia");
            return;
        }

        topo = topo.getProximo();
    }

    public void imprimir() {
        No aux = topo;

        while (aux != null) {
            System.out.print(aux.getDado() + " ");
            aux = aux.getProximo();
        }
    }

    public boolean isVazio() {
        return topo == null;
    }
}
