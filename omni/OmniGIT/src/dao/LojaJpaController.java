/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Loja;

/**
 *
 * @author Pedro
 */
public class LojaJpaController implements Serializable {

    public LojaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Loja loja) {
        
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(loja);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLoja(loja.getIdLoja()) != null) {
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Loja loja) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            loja = em.merge(loja);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = loja.getIdLoja();
                if (findLoja(id) == null) {
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Loja loja;
            try {
                loja = em.getReference(Loja.class, id);
                loja.getIdLoja();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loja with id " + id + " no longer exists.", enfe);
            }
            em.remove(loja);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Loja> findLojaEntities() {
        return findLojaEntities(true, -1, -1);
    }

    public List<Loja> findLojaEntities(int maxResults, int firstResult) {
        return findLojaEntities(false, maxResults, firstResult);
    }

    private List<Loja> findLojaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Loja.class));
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

    public Loja findLoja(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Loja.class, id);
        } finally {
            em.close();
        }
    }

    public int getLojaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Loja> rt = cq.from(Loja.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
