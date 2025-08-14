package lista_ligada;

public interface Lista {

    void inserirNoFinal(int dado);
    void remover(int pos);
    void inserir(int dado, int pos);
    boolean isVazio();
    int buscar(int dado);
}
