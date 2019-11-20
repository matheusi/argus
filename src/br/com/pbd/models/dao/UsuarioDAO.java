package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;


public class UsuarioDAO implements IcoreUsuarioDAO, Serializable {

    private EntityManagerFactory emf = null;
    
    public UsuarioDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public void Salvar(Usuario funcionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<Usuario> getTodosUsuarios() {
        return findUsuarioEntities(true, -1, -1);
    }
    
    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    @Override
    public List<Usuario> getUsuarioPorNome(String nome) {
        EntityManager em = getEntityManager();
        List<Usuario> usuarios = null;
      try{
        String consulta = "select f from Usuario f where f.nome like :nome";
        TypedQuery<Usuario> query = em.createQuery(consulta,Usuario.class);
        query.setParameter("nome","%" + nome + "%");
        usuarios = query.getResultList();
        
      }catch (Exception e){
          e.printStackTrace();
      }finally{
          em.close();
      }
        return usuarios;
    }
    
}
