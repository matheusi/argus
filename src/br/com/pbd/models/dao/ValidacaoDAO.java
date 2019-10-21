package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class ValidacaoDAO implements IcoreValidacaoDAO{
    
    private EntityManagerFactory entityManagerFactory = null;

    public ValidacaoDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
    
    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    
    
    @Override
    public List<Usuario> ValidarLogin(String login, String senha) {
        System.out.println("Entrou na pesquisa");
        EntityManager em = getEntityManager();
        try {
            String consulta = "select f from Usuario f where f.login = :login";
            TypedQuery<Usuario> query = em.createQuery(consulta, Usuario.class);
            query.setParameter("login", login);

            return query.getResultList();

        } finally {
            em.close();
        }

    }
}
