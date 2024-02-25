package br.com.alura.comex;

public class Cliente  implements Identificavel{
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;
    String endereco;


    @Override
    public String identificar() {
        return "Nome: " + this.nome + ", cpf: " + this.cpf;
    }
}
