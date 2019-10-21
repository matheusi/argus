package br.com.pbd.models.business;

import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.IcoreUsuarioDAO;
import br.com.pbd.models.dao.UsuarioDAO;
import br.com.pbd.util.Conexao;

public class UsuarioBusiness implements IcoreUsuarioBusiness{
    
    IcoreUsuarioDAO usuarioDao;
    
    public UsuarioBusiness() {
        this.usuarioDao = new UsuarioDAO(Conexao.conexao());
    }
    
    @Override
    public void Salvar(Usuario usuario){
        usuarioDao.Salvar(usuario);
    }
}
