package br.com.pbd.models.business;

import br.com.pbd.models.beans.Usuario;
import java.util.List;

public interface IcoreUsuarioBusiness {
    public void Salvar(Usuario usuario);
    public List<Usuario> getTodosUsuarios();
}
