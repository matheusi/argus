package br.com.pbd.app;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.fachada.CoreFachada;
import br.com.pbd.util.Criptografar;
import br.com.pbd.view.TelaLogin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    
    public static void main(String[] args) {
        
        CoreFachada fachada = new CoreFachada();
        TelaLogin telaLogin = new TelaLogin(fachada);
        telaLogin.setVisible(true);
        
        Usuario admin = new Usuario();
        admin.setNome("Matheus");
        admin.setLogin("admin");
        admin.setSenha("admin");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        try {
            Date data = formato.parse("27/09/1995");
            admin.setData_nascimento(data);
        } catch (ParseException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        admin.setNaturalidade("Brasileiro");
        admin.setSenha(Criptografar.encriptografar("admin"));
        admin.setTipo("Administrador");
        admin.setCpf("10884550427");
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Presidente Kennedy");
        endereco.setNumero(38);
        endereco.setBairro("Centro");
        endereco.setCidade("Carnaíba");
        endereco.setEstado("Pernambuco");
        endereco.setCep("56820000");
        endereco.setComplemento("Casa");

        admin.setEndereco(endereco);
        
        fachada.SalvarEndereco(endereco);
        fachada.SalvarUsuario(admin);
    }
}
