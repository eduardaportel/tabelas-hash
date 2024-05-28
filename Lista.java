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

    // Override
    @Override
    public String toString(){
        String s = "lista: ";
        if (estaVazia()){
            s += "está vazia";
        }
        else {
            No aux = primeiro;
            while(aux != null){
                s += aux;
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s;
    }
}
