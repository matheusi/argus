package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Endereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class EnderecoDAO implements IcoreEnderecoDAO{
    
      private EntityManagerFactory emf = null;
    
    public EnderecoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    @Override
    public void Salvar(Endereco endereco) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
