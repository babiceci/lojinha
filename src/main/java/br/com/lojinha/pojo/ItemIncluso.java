package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    public ItemIncluso(String nomeInicial,int quantidadeInicial){
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String Novonome){
        this.nome = Novonome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }
}
