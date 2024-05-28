public class Hash {
    // definindo a constante imutável (final) mapa 
    private final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Pessoa[] tabela;

    // inicializando esse vetor tabela 
    public Hash(){
        tabela = new Pessoa[26];
    }
    
    // função hash
    public void insere(Pessoa pessoa){
        // pega a primeira letra do nome da pessoa;
        char primeiraLetra = pessoa.getNome().charAt(0);
        // insere a pessoa na posição de sua inicial
        int posicao = mapa.indexOf(primeiraLetra);
        tabela[posicao] = pessoa;
    }

    // Override adicionado
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < 26; i++){
            s += tabela[i] + "\n";
        }
        return s;
    }
}
