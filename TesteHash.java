public class TesteHash {
    public static void main(String[] args) {
        // sem tratamento de colisões
        // Hash listaPessoas = new Hash();

        // com tratamento de colisão
        HashTratamentoColisao listaPessoas = new HashTratamentoColisao();
        // criando pessoas
        Pessoa p1 = new Pessoa("Ana", 2000);
        Pessoa p2 = new Pessoa("Bia", 2010);
        Pessoa p3 = new Pessoa("Antonio", 2000);

        // inserindo-as na lista
        listaPessoas.insere(p1);
        listaPessoas.insere(p2);
        listaPessoas.insere(p3);

        // print do teste
        System.out.println(listaPessoas);
        
    }
}
