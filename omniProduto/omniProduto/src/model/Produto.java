package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {
    
    @Id
    @Column(name="codproduto")
    private int codproduto;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="preco")
    private double preco;
    
    @Column(name="dataInsercao")
    private long dataInsercao;
    
    @Column(name="marca")
    private String marca;

    public Produto(int codproduto, String nome, String descricao, double preco, int dataInsercao, String marca) {
        this.codproduto         = codproduto;
        this.nome               = nome;
        this.descricao          = descricao;
        this.preco              = preco;        
        this.dataInsercao       = dataInsercao;
        this.marca              = marca;
    }
    
    public Produto(){}

    public int getCodproduto() {
        return codproduto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public long getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(long dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
