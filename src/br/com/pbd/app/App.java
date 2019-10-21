package br.com.pbd.app;

import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.fachada.CoreFachada;
import br.com.pbd.util.Criptografar;
import br.com.pbd.view.TelaLogin;

public class App {
    
    public static void main(String[] args) {
        
        CoreFachada fachada = new CoreFachada();
        TelaLogin telaLogin = new TelaLogin(fachada);
        telaLogin.setVisible(true);
        
        Usuario admin = new Usuario();
        admin.setNome("Matheus");
        admin.setLogin("admin");
        admin.setSenha("admin");
        admin.setNaturalidade("Brasileiro");
        admin.setSenha(Criptografar.encriptografar("admin"));
        admin.setTipo("Administrador");

        fachada.SalvarUsuario(admin);
    }
}
