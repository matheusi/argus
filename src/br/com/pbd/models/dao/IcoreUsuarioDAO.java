package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import java.util.List;

public interface IcoreUsuarioDAO {
    
    public void Salvar(Usuario usuario);
    
    public List<Usuario> getTodosUsuarios();
    
    public List<Usuario> getUsuarioPorNome(String nome);
    
    public Usuario getUsuarioPorId(Integer id);
    
    public List<Usuario> getTodosAlunos();

    public void Remover(Integer id) throws NonexistentEntityException;
    
    public void Editar(Usuario usuario) throws  NonexistentEntityException, Exception ;
}
