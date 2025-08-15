package arvore_binaria;

public class ArvoreBinaria implements Arvore {

    private No raiz;


    @Override
    public void inserir(int dado) {
        raiz = inserirRecursivo(raiz, dado);
    }

    @Override
    public void imprimir() {

    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getEsquerda());
            System.out.println(no.getDado());
            emOrdem(no.getDireita());
        }
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.println(no.getDado());
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.println(no.getDado());
        }
    }

    private No inserirRecursivo(No no, int dado) {
        if (no == null) {
            return new No(dado);
        }
        else if (dado > no.getDado()) {
            no.setDireita(inserirRecursivo(no.getDireita(), dado));
        }
        else if (dado < no.getDado()) {
            no.setEsquerda(inserirRecursivo(no.getEsquerda(), dado));
        }
        return no;
    }

    @Override
    public boolean isVazio() {
        return raiz == null;
    }
}