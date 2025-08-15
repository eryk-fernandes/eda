package fila;

public class Main {
    public static void main(String[] args) {

        Fila fila = new FilaEncadeada();

        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(5);

        fila.imprimir();
        System.out.println();

        fila.remover();

        fila.imprimir();
        System.out.println();

        fila.inserir(7);
        fila.inserir(11);
        fila.inserir(13);

        fila.imprimir();
        System.out.println();

        fila.remover();

        fila.imprimir();
    }
}