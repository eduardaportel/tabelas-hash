public class TesteHash {
    public static void main(String[] args) {
        // sem tratamento de colisões
        // Hash listaPessoas = new Hash();

        // com tratamento de colisão
        HashTratamentoColisao listaPessoas = new HashTratamentoColisao();
        // criando pessoas
        Pessoa p1 = new Pessoa("Ana", 2000);
        listaPessoas.insere(p1);
        Pessoa p2 = new Pessoa("Bia", 2010);
        listaPessoas.insere(p2);
        Pessoa p3 = new Pessoa("Antonio", 2000);
        listaPessoas.insere(p3);

        // print do teste
        System.out.println(listaPessoas);
        
    }
}
