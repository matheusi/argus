package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.AtendimentoPedagogico;
import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.business.AtenPedagBusiness;
import br.com.pbd.models.business.EnderecoBusiness;
import br.com.pbd.models.business.IcoreAtenPedagBusiness;
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
    IcoreAtenPedagBusiness atendPedagBusiness;
    
    public CoreFachada() {
        this.validacaoBusiness = new ValidacaoBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
        this.enderecoBusiness = new EnderecoBusiness();
        this.atendPedagBusiness = new AtenPedagBusiness();
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

    @Override
    public void RemoverUsuario(Integer id) throws NonexistentEntityException {
        usuarioBusiness.Remover(id);
    }

    @Override
    public void EditarUsuario(Usuario usuario) throws NonexistentEntityException, Exception {
        usuarioBusiness.Editar(usuario);
    }

    @Override
    public Usuario getUsuarioPorId(Integer id) {
        return usuarioBusiness.getUsuarioPorId(id);
    }

    @Override
    public void EditarEndereco(Endereco endereco) throws NonexistentEntityException, Exception {
        enderecoBusiness.Editar(endereco);
    }

    @Override
    public void Salvar(AtendimentoPedagogico atendimentoPedagogico) {
        atendPedagBusiness.Salvar(atendimentoPedagogico);
    }

    @Override
    public List<AtendimentoPedagogico> getTodosAtendPedag() {
        return atendPedagBusiness.getTodosAtendPedag();
    }

    @Override
    public List<AtendimentoPedagogico> getAtendPedagPorNome(String nome) {
        return atendPedagBusiness.getAtendPedagPorNome(nome);
    }

    @Override
    public AtendimentoPedagogico getAtendPedagPorId(Integer id) {
        return atendPedagBusiness.getAtendPedagPorId(id);
    }

    @Override
    public void Remover(Integer id) throws NonexistentEntityException {
        atendPedagBusiness.getAtendPedagPorId(id);
    }

    @Override
    public void Editar(AtendimentoPedagogico atendimentoPedagogico) throws NonexistentEntityException, Exception {
        atendPedagBusiness.Editar(atendimentoPedagogico);
    }
}
