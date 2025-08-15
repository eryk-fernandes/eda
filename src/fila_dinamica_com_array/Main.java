package fila_dinamica_com_array;

public class Main {
    public static void main(String[] args) {

        FilaDinamicaComArray fila = new FilaDinamicaComArray(5);

        fila.enqueue(2);
        fila.enqueue(5);
        fila.enqueue(7);
        fila.enqueue(11);
        fila.enqueue(13);
        fila.show();
        System.out.println("\nTamanho: " + fila.tamanho);
        System.out.println();


        fila.enqueue(17);

        fila.show();
        System.out.println("\nTamanho: " + fila.tamanho);

    }
}