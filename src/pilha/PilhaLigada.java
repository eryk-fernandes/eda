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

    }

    public boolean isVazio() {
        return topo == null;
    }
}
