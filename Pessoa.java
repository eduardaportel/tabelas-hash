public class Pessoa{
    private String nome;
    private int anoNascimento;

    // retorna o nome
    public String getNome(){
        return nome;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    // atributo nome = variável que veio pelo parâmetro
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
}