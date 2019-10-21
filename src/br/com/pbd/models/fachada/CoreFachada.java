package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.business.IcoreUsuarioBusiness;
import br.com.pbd.models.business.IcoreValidacaoBusiness;
import br.com.pbd.models.business.UsuarioBusiness;
import br.com.pbd.models.business.ValidacaoBusiness;
import java.util.List;

public class CoreFachada implements IcoreFachada{



    IcoreValidacaoBusiness validacaoBusiness;
    IcoreUsuarioBusiness usuarioBusiness;
    
    public CoreFachada() {
        this.validacaoBusiness = new ValidacaoBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
    }

    @Override
    public List<Usuario> ValidarLogin(String login, String senha) {
        return validacaoBusiness.ValidarLogin(login, senha);
    }

//    @Override
//    public void SalvarFuncionario(Funcionario funcionario) {
//        funcionarioBusiness.Salvar(funcionario);
//    }
//   
    @Override
    public void SalvarUsuario(Usuario usuario) {
        usuarioBusiness.Salvar(usuario);
    }
}
