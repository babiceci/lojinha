package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(30);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso); //0
        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso); //1
        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 2);
        itensInclusos.add(terceiroItemIncluso); //2

        meuProduto.setitensInclusos(itensInclusos);

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());

        System.out.println("comecando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getitensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("Acabaram-se os itens");
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("nintendo",Tamanho.MEDIO);
        System.out.println(meuProdutoNacional.getMarca());
        meuProdutoNacional.setImpostoNacional(0.5555);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        meuProdutoNacional.setValor(40);
        System.out.println(meuProdutoNacional.getValor());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutoInternacional.setValor(20);
        System.out.println(meuProdutoInternacional.getValor());
        System.out.println(meuProdutoInternacional.getDadosFavoritos());


        }

}
