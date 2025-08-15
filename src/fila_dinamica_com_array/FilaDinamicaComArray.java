package fila_dinamica_com_array;

public class FilaDinamicaComArray {

    Object[] array;
    int tamanho;

    public FilaDinamicaComArray(int tamanho) {
        array = new Object[tamanho];
        this.tamanho = tamanho;
    }

    public void enqueue(Object dado) {

        if (tamanho == size()) {
            Object[] novoArray = new Object[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = array[i];
            }

            array = novoArray;
            tamanho = tamanho * 2;
        }

        for (int i = 0; i < tamanho; i++) {
            if (array[i] == null) {
                array[i] = dado;
                return;
            }
        }
    }

    public void dequeeu() {
        array[0] = array[1];

        int i = 1;
        while (array[i] != null) {
            array[i] = array[i+1];
            i++;
        }
    }

    public void show() {
        int i = 0;
        while (i < size()) {
            System.out.print(array[i] + " ");
            i++;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        int size = 0;

        int i = 0;

        while (i != tamanho && array[i] != null) {
            size++;
            i++;
        }

        return size;
    }

}
