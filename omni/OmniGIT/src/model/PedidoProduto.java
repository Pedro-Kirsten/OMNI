package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidoproduto")
public class PedidoProduto implements Serializable {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codpedidoproduto")
    private int codpedidoproduto;

    @Column(name = "quantidade")
    private int quantidade;

    public PedidoProduto(int codpedidoproduto, int quantidade) {
        this.codpedidoproduto = codpedidoproduto;
        this.quantidade = quantidade;
    }

    public PedidoProduto() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodpedidoproduto() {
        return codpedidoproduto;
    }

    public void setCodpedidoproduto(int codpedidoproduto) {
        this.codpedidoproduto = codpedidoproduto;
    }
    

}
