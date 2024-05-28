public class TesteHash {
    public static void main(String[] args) {
        // sem tratamento de colisões
        Hash listaPessoas = new Hash();

        // criando pessoas p1 e p2 
        Pessoa p1 = new Pessoa("Ana", 2000);
        Pessoa p2 = new Pessoa("Bia", 2010);

        // inserindo-as na lista
        listaPessoas.insere(p1);
        listaPessoas.insere(p2);

        // print do teste
        System.out.println(listaPessoas);
        
    }
}
