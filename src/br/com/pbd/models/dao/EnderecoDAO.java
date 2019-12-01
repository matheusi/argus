package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    @Override
    public void Editar(Endereco endereco) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            endereco = em.merge(endereco);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = endereco.getId();
                if (findEndereco(id) == null) {
                    try {
                        throw new NonexistentEntityException("The endereco with id " + id + " no longer exists.");
                    } catch (NonexistentEntityException ex1) {
                        Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    public Endereco findEndereco(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Endereco.class, id);
        } finally {
            em.close();
        }
    }
}
