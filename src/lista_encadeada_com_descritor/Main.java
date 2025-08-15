package lista_encadeada_com_descritor;

public class Main {
    public static void main(String[] args) {

        ListaEncadeadaComDescritor lista = new ListaEncadeadaComDescritor();

        lista.inserirNoFinal(2);
        lista.inserirNoFinal(3);
        lista.inserirNoFinal(5);
        lista.inserirNoFinal(7);
        lista.inserirNoFinal(11);
        lista.removerNoFinal();

        System.out.println("Tamanho: " + lista.getTamanhoDescritor());
        System.out.println("Inicio: " + lista.getInicioDescritor());
        System.out.println("Fim: " + lista.getFimDescritor());
        System.out.println();

        lista.imprimir();



    }
}