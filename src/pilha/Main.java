package pilha;

public class Main {
    public static void main(String[] args) {

        PilhaLigada pilha = new PilhaLigada();

        pilha.push(2);
        pilha.push(3);
        pilha.push(6);
        pilha.pop();
        pilha.imprimir();

    }
}