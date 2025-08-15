package lista_ligada;

public interface Lista {

    void inserir(int dado, int pos);
    void inserirNoFinal(int dado);
    void inserirNoInicio(int dado);
    void remover(int pos);
    void removerNoFinal();
    void removerNoInicio();
    boolean isVazio();
    int buscar(int dado);
    int quantidade();
    void imprimir();
}
