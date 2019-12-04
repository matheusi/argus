package br.com.pbd.models.dao;

import br.com.pbd.models.beans.AtendimentoPedagogico;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import java.util.List;

public interface IcoreAtenPedagDAO {
    
    public void Salvar(AtendimentoPedagogico atendimentoPedagogico);
    
    public List<AtendimentoPedagogico> getTodosAtendPedag();
    
    public List<AtendimentoPedagogico> getAtendPedagPorNome(String nome);
    
    public AtendimentoPedagogico getAtendPedagPorId(Integer id);

    public void Remover(Integer id) throws NonexistentEntityException;
    
    public void Editar(AtendimentoPedagogico atendimentoPedagogico) throws  NonexistentEntityException, Exception ;
}
