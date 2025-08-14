package pilha;

public class Main {
    public static void main(String[] args) {

        PilhaEncadeada pilha = new PilhaEncadeada();

        pilha.push(2);
        pilha.push(3);
        pilha.push(6);
        pilha.imprimir();
        System.out.println();
        pilha.imprimirInversa();

    }
}