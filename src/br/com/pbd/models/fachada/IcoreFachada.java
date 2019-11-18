package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import java.util.List;

public interface IcoreFachada {
    
    public List<Usuario> ValidarLogin(String login, String senha);
    
    //FUNCIONARIO
    public void SalvarUsuario(Usuario usuario);
    
    //ENDERECO
     public void SalvarEndereco(Endereco endereco);
}
