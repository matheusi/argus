package br.com.pbd.models.dao;

import br.com.pbd.models.beans.AtendimentoPedagogico;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

public class AtenPedagDAO implements IcoreAtenPedagDAO, Serializable {
    
    private EntityManagerFactory emf = null;
    
    public AtenPedagDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    @Override
    public void Salvar(AtendimentoPedagogico atendimentoPedagogico) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(atendimentoPedagogico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<AtendimentoPedagogico> getTodosAtendPedag() {
        return findAtendPedagEntities(true, -1, -1);
    }
    
    private List<AtendimentoPedagogico> findAtendPedagEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AtendimentoPedagogico.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    public AtendimentoPedagogico findAtendPedag(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AtendimentoPedagogico.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<AtendimentoPedagogico> getAtendPedagPorNome(String descricao) {
        EntityManager em = getEntityManager();
        List<AtendimentoPedagogico> atendPedag = null;
      try{
        String consulta = "select f from AtendimentoPedagogico f where f.descricao like :descricao";
        TypedQuery<AtendimentoPedagogico> query = em.createQuery(consulta,AtendimentoPedagogico.class);
        query.setParameter("descricao","%" + descricao + "%");
        atendPedag = query.getResultList();
        
      }catch (Exception e){
          e.printStackTrace();
      }finally{
          em.close();
      }
        return atendPedag;
    }

    @Override
    public AtendimentoPedagogico getAtendPedagPorId(Integer id) {
        EntityManager em = getEntityManager();
        try {
            AtendimentoPedagogico atendPedag = em.find(AtendimentoPedagogico.class, id);
            atendPedag.getPessoas();
            return atendPedag;
        } finally {
            em.close();
        }
    }

    @Override
    public void Remover(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AtendimentoPedagogico atendPedag;
            try {
                atendPedag = em.getReference(AtendimentoPedagogico.class, id);
                atendPedag.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The atendimentopedagogico with id " + id + " no longer exists.", enfe);
            }
            em.remove(atendPedag);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Editar(AtendimentoPedagogico atendimentoPedagogico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            atendimentoPedagogico = em.merge(atendimentoPedagogico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = atendimentoPedagogico.getId();
                if (findAtendPedag(id) == null) {
                    throw new NonexistentEntityException("The atendimentoPedagogico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
