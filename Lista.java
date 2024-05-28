public class Lista {
    private No primeiro;

    // verifica se está vazia
    public boolean estaVazia(){
        return primeiro == null;
    }

    // método insere
    public void insere(Pessoa info){
        No novo = new No(info);
        if(!estaVazia())
            novo.setProximo(primeiro);
        primeiro = novo;
    }
    
    // Override
    @Override
    public String toString(){
        String s = "Lista: ";
        if (estaVazia()){
            s += "vazia";
        }
        else {
            No aux = primeiro;
            while(aux != null) {
                s += aux;
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s + "\n";
    }
}
