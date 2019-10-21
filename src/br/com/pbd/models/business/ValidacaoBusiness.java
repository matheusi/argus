package br.com.pbd.models.business;

import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.IcoreValidacaoDAO;
import br.com.pbd.models.dao.ValidacaoDAO;
import br.com.pbd.util.Conexao;
import java.util.List;

public class ValidacaoBusiness implements IcoreValidacaoBusiness{

    IcoreValidacaoDAO validacaoDAO;

    public ValidacaoBusiness() {
        this.validacaoDAO = new ValidacaoDAO(Conexao.conexao());
    }
    
    
    @Override
    public List<Usuario> ValidarLogin(String login, String senha) {
        return validacaoDAO.ValidarLogin(login, senha);
    }
    
}
