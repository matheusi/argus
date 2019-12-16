package br.com.pbd.models.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
@SequenceGenerator(name = "atendimentoPedagogico_sequence", sequenceName = "atendimentoPedagogico_seq", initialValue = 1, allocationSize = 1)
public class AtendimentoPedagogico implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atendimentoPedagogico_sequence")
    private Integer id;
    
    @Column(length = 255, nullable = false)
    private String descricao;
    
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @Column(length = 255, nullable = false)
    private String status;
    
    @ManyToMany
    @JoinTable(name = "atend_pedag_usua", joinColumns = @JoinColumn(name = "id_atend"), inverseJoinColumns = @JoinColumn(name = "id_usua"))
    private List<Usuario> pessoas = new LinkedList<Usuario>();
    

    public AtendimentoPedagogico() {
        
    }

    public AtendimentoPedagogico(Integer id, String descricao, Date data, String status) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Usuario> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Usuario> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.descricao);
        hash = 71 * hash + Objects.hashCode(this.data);
        hash = 71 * hash + Objects.hashCode(this.status);
        hash = 71 * hash + Objects.hashCode(this.pessoas);
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
        final AtendimentoPedagogico other = (AtendimentoPedagogico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.pessoas, other.pessoas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AtendimentoPedagogico{" + "id=" + id + ", descricao=" + descricao + ", data=" + data + ", status=" + status + ", pessoas=" + pessoas + '}';
    }

    

}
