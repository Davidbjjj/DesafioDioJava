package PraticaDePOO;

public class SitemCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("1180", "David");
        System.out.println(pessoa.getCpf()+"-"+ pessoa.getNome());
    }
}
