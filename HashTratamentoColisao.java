public class HashTratamentoColisao {
    // string igual o alfabeto
    private final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // tabela hash é um vetor de objetos da classe lista
    private Lista[] tabela;

    // função hash para tratamento de colisão
    public HashTratamentoColisao(){
        tabela = new Lista[26];
        // cada posição guarda uma lista dinâmica
        for(int i = 0; i < 25; i++){
            tabela[i] = new Lista();
        }
    }

    // insere com a lista dinâmica
    public void insere(Pessoa pessoa){
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
        tabela[posicao].insere(pessoa);
    }

    // Override
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < 26; i++){
        tabela[i] = new Lista();    
        }
    }

}
