package lista_encadeada_com_descritor_generica;

public class No<T> {

    private T dado;
    private No<T> proximo;

    public No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
