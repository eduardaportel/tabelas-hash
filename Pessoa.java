public class Pessoa{
    private String nome;
    private int anoNascimento;

    // pega e retorna o nome
    public String getNome(){
        return nome;
    }
    // pega e retorna o ano
    public int getAnoNascimento(){
        return anoNascimento;
    }

    // set o atributo com a variável que veio pelo parâmetro
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    // construtor
    public Pessoa(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    // Override da classe Pessoa
    @Override
    public String toString(){
        return "[nome = " + nome + ", anoNascimento = " + anoNascimento + "]";
    }
}