public class Pessoa{
    private String nome;
    private int anoNascimento;

    // getters
    public String getNome(){
        return nome;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }

    // setters
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
        return "[ nome = " + nome + ", anoNascimento = " + anoNascimento + "]";
    }
}