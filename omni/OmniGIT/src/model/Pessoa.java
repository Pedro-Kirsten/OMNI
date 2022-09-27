package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
    
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpessoa")
    private int idPessoa;
    
    @Column(name = "nomepessoa")
    private String nomePessoa;
    
    @Column(name = "endereco")
    private String endereco;
    
    @Column(name = "telefone")
    private String telefone;
    


    public Pessoa(int IdPessoa, String nomePessoa, String endereco, String telefone) {
        this.idPessoa = IdPessoa;
        this.nomePessoa = nomePessoa;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int IdPessoa) {
        this.idPessoa = IdPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}