package br.com.pbd.models.business;

import br.com.pbd.models.beans.AtendimentoPedagogico;
import br.com.pbd.models.dao.AtenPedagDAO;
import br.com.pbd.models.dao.IcoreAtenPedagDAO;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import br.com.pbd.util.Conexao;
import java.util.List;


public class AtenPedagBusiness implements IcoreAtenPedagBusiness{
    
    IcoreAtenPedagDAO atendPedagDAO;

    public AtenPedagBusiness() {
        this.atendPedagDAO = new AtenPedagDAO(Conexao.conexao());
    }
    
    @Override
    public void Salvar(AtendimentoPedagogico atendimentoPedagogico) {
        atendPedagDAO.Salvar(atendimentoPedagogico);
    }

    @Override
    public List<AtendimentoPedagogico> getTodosAtendPedag() {
        return atendPedagDAO.getTodosAtendPedag();
    }

    @Override
    public List<AtendimentoPedagogico> getAtendPedagPorNome(String nome) {
        return atendPedagDAO.getAtendPedagPorNome(nome);
    }

    @Override
    public AtendimentoPedagogico getAtendPedagPorId(Integer id) {
        return atendPedagDAO.getAtendPedagPorId(id);
    }

    @Override
    public void Remover(Integer id) throws NonexistentEntityException {
        atendPedagDAO.Remover(id);
    }

    @Override
    public void Editar(AtendimentoPedagogico atendimentoPedagogico) throws NonexistentEntityException, Exception {
        atendPedagDAO.Editar(atendimentoPedagogico);
    }
    
}
