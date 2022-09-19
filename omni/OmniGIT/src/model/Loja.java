package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loja")
public class Loja implements Serializable {

    @Id
    @Column(name = "idLoja")
    private int IdLoja;

    @Column(name = "nomeLoja")
    private String nomeLoja;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "localizacao")
    private String local;

    @Column(name = "cnpj")
    private String cnpj;

    public Loja(int IdLoja, String nomeLoja, String telefone, String local, String cnpj) {
        this.IdLoja = IdLoja;
        this.nomeLoja = nomeLoja;
        this.telefone = telefone;
        this.local = local;
        this.cnpj = cnpj;
    }

    public Loja() {
    }

    public int getIdLoja() {
        return IdLoja;
    }

    public void setIdLoja(int IdLoja) {
        this.IdLoja = IdLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
