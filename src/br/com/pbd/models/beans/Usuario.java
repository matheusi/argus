package br.com.pbd.models.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
@SequenceGenerator(name = "usuario_sequence", sequenceName = "usuario_seq", initialValue = 1, allocationSize = 1)
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_sequence")
    private Integer id;
    
    @Column(length = 100, nullable = false)
    private String nome;
    
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data_nascimento;
    
    @Column(length = 100, nullable = false)
    private String naturalidade;
    
    @Column(length = 14)
    private String cpf;
    
    @Column(length = 25)
    private String login;
    
    @Column(length = 255)
    private String senha;
    
    @Column(length = 30, nullable = false)
    private String tipo;
    
    @ManyToOne(optional = true)
    @JoinColumn(referencedColumnName = "id")
    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, Date data_nascimento, String naturalidade, String cpf, String login, String senha, String tipo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.naturalidade = naturalidade;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.data_nascimento);
        hash = 47 * hash + Objects.hashCode(this.naturalidade);
        hash = 47 * hash + Objects.hashCode(this.cpf);
        hash = 47 * hash + Objects.hashCode(this.login);
        hash = 47 * hash + Objects.hashCode(this.senha);
        hash = 47 * hash + Objects.hashCode(this.tipo);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.data_nascimento, other.data_nascimento)) {
            return false;
        }
        if (!Objects.equals(this.naturalidade, other.naturalidade)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", data_nascimento=" + data_nascimento + ", naturalidade=" + naturalidade + ", cpf=" + cpf + ", login=" + login + ", senha=" + senha + ", tipo=" + tipo + ", endereco=" + endereco + '}';
    }

    
    
}
