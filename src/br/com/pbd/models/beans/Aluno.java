package br.com.pbd.models.beans;

import java.io.Serializable;
import java.util.Date;
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
@SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_seq", initialValue = 1, allocationSize = 1)
public class Aluno implements Serializable {
    
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
    
}
