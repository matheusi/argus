package br.com.pbd.models.business;

import br.com.pbd.models.beans.Usuario;
import java.util.List;

public interface IcoreValidacaoBusiness {
    public List<Usuario> ValidarLogin(String login, String senha);
}
