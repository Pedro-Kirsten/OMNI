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
    
    @Column(name = "cpf")
    private String cpf;

    public Pessoa(int idPessoa, String nomePessoa, String endereco, String telefone, String cpf) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  

    
}