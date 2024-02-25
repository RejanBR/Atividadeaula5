package br.com.alura.comex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o id do produto");
            int idProduto = leitura.nextInt();
            System.out.println("id do Produto:" + idProduto);

        } catch (InputMismatchException e){
            System.out.println("Erro! você digitou um valor não numérico");
        }



    }
}
