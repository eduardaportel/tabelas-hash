public class Hash {
    // definindo a constante imutável (final) mapa 
    private final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // tabela hash
    private Pessoa[] tabela;
    public Hash(){
        // 26 espaços de memória reservados
        tabela = new Pessoa[26];
    }
    
    public void insere(Pessoa pessoa){
        // pega a primeira letra do nome da pessoa;
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
    }
}
