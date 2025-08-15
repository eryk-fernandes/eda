package fila_encadeada;

public interface Fila {

    void inserir(int dado);
    void remover();
    boolean isVazio();
    int buscar(int dado);
    int quantidade();
    void imprimir();
}
