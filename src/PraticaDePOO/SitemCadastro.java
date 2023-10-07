package PraticaDePOO;

public class SitemCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("1180", "David");
        /** Sempre que for colocar algo "set"*/
        pessoa.setNumero("(81)988770146");
        /** Sempre que for pegar algo "set"*/
        System.out.println(pessoa.getCpf()+"-"+ pessoa.getNome()+"-"+pessoa.getNumero());
    }
}
