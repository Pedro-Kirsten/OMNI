package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "codproduto")
    private int codProduto;
        
    @Column(name = "nomeproduto")
    private String nomeproduto;

    @Column(name = "marca")
    private String marca;

    @Column(name = "valor")
    private double valor;

    public Produto(int codProduto, String nomeproduto, String marca, double valor) {
        this.codProduto = codProduto;
        this.nomeproduto = nomeproduto;
        this.marca = marca;
        this.valor = valor;
    }

    public Produto() {
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
