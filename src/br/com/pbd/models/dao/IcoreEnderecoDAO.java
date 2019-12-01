package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;

public interface IcoreEnderecoDAO {
     public void Salvar(Endereco endereco);
     public void Editar(Endereco endereco) throws  NonexistentEntityException, Exception ;
}
