package br.com.alura.comex;

public class Livro extends Produto implements Identificavel {
    String isbn;
    int totalPaginas;

    @Override
    public String identificar() {
        return "isbn: " + this.isbn + ", Nome: " + this.nome;
    }
}
