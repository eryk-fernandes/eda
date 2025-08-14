package lista_ligada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaLigada listaLigada = new ListaLigada();

        listaLigada.inserirNoFinal(2);
        listaLigada.inserirNoFinal(3);
        listaLigada.inserirNoFinal(5);
        listaLigada.inserirNoFinal(7);
        listaLigada.inserirNoFinal(11);

        listaLigada.inserir(1, 4);

        listaLigada.imprimir();

    }
}