package lista_encadeada_com_descritor_generica;

public class Descritor<T> {
    int tamanho;
    No<T> inicio;
    No<T> fim;

    public Descritor() {
        tamanho = 0;
    }

}
