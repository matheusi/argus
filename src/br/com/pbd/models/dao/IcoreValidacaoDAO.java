package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Usuario;
import java.util.List;

public interface IcoreValidacaoDAO {
    public List<Usuario> ValidarLogin(String login, String senha);
}
