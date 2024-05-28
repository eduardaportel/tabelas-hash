public class Lista {
    private No primeiro;

    // verifica se está vazia
    public boolean estaVazia(){
        return primeiro == null;
    }

    // método insere
    public void insere(Pessoa info){
        No novo = new No(info);
        if(!estaVazia()){
            novo.setProximo(primeiro);
            // aponta para o novo Nó inserido
            primeiro = novo;
        }
    }
}
