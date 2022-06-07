package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;


    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public List<ItemIncluso> getitensInclusos(){
        return this.itensInclusos;
    }
    public void setitensInclusos( List<ItemIncluso> NovosItensInclusos){
        this.itensInclusos = NovosItensInclusos;
    }

    public double getValor() { //valor
        return this.valor;
           }

    public void setValor(double novoValor){
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome (String novoNome){
        this.nome = novoNome;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }

    public Tamanho getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(Tamanho novoTamanho){
        this.tamanho = novoTamanho;
    }

}
