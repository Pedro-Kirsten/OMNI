package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {
    
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codpedido")
    private int codPedido;
    
    @Column (name= "valortotal")
    private double valorTotal;
    
    @Column (name = "enderecoentrega")
    private String enderecoEntrega;

    public Pedido(int codPedido, double valorTotal, String enderecoEntrega) {
        this.codPedido = codPedido;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
    }

    public Pedido() {
    }
        
    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    
    
}
