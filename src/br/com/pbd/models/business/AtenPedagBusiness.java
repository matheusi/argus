package br.com.pbd.models.business;

import br.com.pbd.models.beans.AtendimentoPedagogico;
import br.com.pbd.models.dao.AtenPedagDAO;
import br.com.pbd.models.dao.IcoreAtenPedagDAO;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import br.com.pbd.util.Conexao;
import java.util.List;


public class AtenPedagBusiness implements IcoreAtenPedag{
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AtendimentoPedagogico getAtendPedagPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(Integer id) throws NonexistentEntityException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editar(AtendimentoPedagogico atendimentoPedagogico) throws NonexistentEntityException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
