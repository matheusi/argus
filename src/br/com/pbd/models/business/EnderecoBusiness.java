package br.com.pbd.models.business;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.dao.EnderecoDAO;
import br.com.pbd.models.dao.IcoreEnderecoDAO;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import br.com.pbd.util.Conexao;



public class EnderecoBusiness implements IcoreEnderecoBusiness{
    
    IcoreEnderecoDAO enderecoDao;

    public EnderecoBusiness() {
        this.enderecoDao = new EnderecoDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Endereco endereco) {
        enderecoDao.Salvar(endereco);
    }

    @Override
    public void Editar(Endereco endereco) throws NonexistentEntityException, Exception {
        enderecoDao.Editar(endereco);
    }



    

}
