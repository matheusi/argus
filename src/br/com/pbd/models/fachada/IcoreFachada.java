package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.AtendimentoPedagogico;
import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import java.util.List;

public interface IcoreFachada {
    
    public List<Usuario> ValidarLogin(String login, String senha);
    
    //USUARIO
    public void SalvarUsuario(Usuario usuario);
    public List<Usuario> getTodosUsuarios();
    public List<Usuario> getTodosAlunos();
    public List<Usuario> getUsuarioPorNome(String nome);
    public void RemoverUsuario(Integer id) throws NonexistentEntityException;
    public void EditarUsuario(Usuario usuario) throws NonexistentEntityException, Exception;
    public Usuario getUsuarioPorId(Integer id);
    
    //ENDERECO
     public void SalvarEndereco(Endereco endereco);
     public void EditarEndereco(Endereco endereco) throws NonexistentEntityException, Exception;
     
     //ATENDIMENTO PEDAGOGICO
    public void Salvar(AtendimentoPedagogico atendimentoPedagogico);
    public List<AtendimentoPedagogico> getTodosAtendPedag();
    public List<AtendimentoPedagogico> getAtendPedagPorNome(String nome) ;
    public AtendimentoPedagogico getAtendPedagPorId(Integer id);
    public void Remover(Integer id) throws NonexistentEntityException;
    public void Editar(AtendimentoPedagogico atendimentoPedagogico) throws  NonexistentEntityException,Exception;
}
