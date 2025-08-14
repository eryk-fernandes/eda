package fila;

import lista_ligada.ListaEncadeada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.inserirNoFinal(2);
        listaEncadeada.inserirNoFinal(3);
        listaEncadeada.inserirNoFinal(5);
        listaEncadeada.inserirNoFinal(7);
        listaEncadeada.inserirNoFinal(11);

        listaEncadeada.inserir(1, 4);

        listaEncadeada.imprimir();

    }
}