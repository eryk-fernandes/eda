package lista_ligada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.inserirNoFinal(2);
        listaEncadeada.inserirNoFinal(3);
        listaEncadeada.inserirNoFinal(5);
        listaEncadeada.inserirNoFinal(7);
        listaEncadeada.inserirNoFinal(11);
        listaEncadeada.removerNoFinal();

        listaEncadeada.imprimir();

    }
}