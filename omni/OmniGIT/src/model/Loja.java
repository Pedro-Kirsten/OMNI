package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loja")
public class Loja implements Serializable {
    @Id
    @Column(name= "idLoja")
    private int idLoja;    
    
    @Column(name="'nomeLoja'")
    private String nomeLoja;
    
    @Column(name="cnpj")
    private String cnpj;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="localizacao")
    private String local;

    public Loja(int idLoja, String nomeLoja, String cnpj, String telefone, String local) {
        this.idLoja = idLoja;
        this.nomeLoja = nomeLoja;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.local = local;
    }

    public Loja() {
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getCnpj() {
        return cnpj;
        
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    
    
    
    
}
