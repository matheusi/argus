package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.business.EnderecoBusiness;
import br.com.pbd.models.business.IcoreEnderecoBusiness;
import br.com.pbd.models.business.IcoreUsuarioBusiness;
import br.com.pbd.models.business.IcoreValidacaoBusiness;
import br.com.pbd.models.business.UsuarioBusiness;
import br.com.pbd.models.business.ValidacaoBusiness;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import java.util.List;

public class CoreFachada implements IcoreFachada{

    IcoreValidacaoBusiness validacaoBusiness;
    IcoreUsuarioBusiness usuarioBusiness;
    IcoreEnderecoBusiness enderecoBusiness;
    
    public CoreFachada() {
        this.validacaoBusiness = new ValidacaoBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
        this.enderecoBusiness = new EnderecoBusiness();
    }

    @Override
    public List<Usuario> ValidarLogin(String login, String senha) {
        return validacaoBusiness.ValidarLogin(login, senha);
    }

    
    @Override
    public void SalvarUsuario(Usuario usuario) {
        usuarioBusiness.Salvar(usuario);
    }

    @Override
    public void SalvarEndereco(Endereco endereco) {
        enderecoBusiness.Salvar(endereco);
    }

    @Override
    public List<Usuario> getTodosUsuarios() {
        return usuarioBusiness.getTodosUsuarios();
    }

    @Override
    public List<Usuario> getUsuarioPorNome(String nome){
        return usuarioBusiness.getUsuarioPorNome(nome);
    }
}
