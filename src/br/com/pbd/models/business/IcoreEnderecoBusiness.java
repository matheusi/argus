package br.com.pbd.models.business;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;

public interface IcoreEnderecoBusiness {
    public void Salvar(Endereco endereco);
    public void Editar(Endereco endereco) throws  NonexistentEntityException,Exception;
}
