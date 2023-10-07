
package PraticaDePOO;
public class Pessoa {
    private String cpf;
    private String Nome;
    private String Numero;
    /** Sempre que criar uma pessoa vou quer que colocar automaticamente o nome e cpf*/

    public Pessoa (String cpf, String nome){
        this.Nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

}
