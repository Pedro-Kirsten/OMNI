package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import model.Produto;

public class ProdutoJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public ProdutoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void create(Produto produto) {

        produto.setCodproduto(this.generatedNextId());

        EntityManager em = null;
        try {

            em = this.emf.createEntityManager();

            em.getTransaction().begin();

            em.persist(produto);

            em.getTransaction().commit();

        } catch (Exception ex) {
            if (findProduto(produto.getCodproduto()) != null) {
                System.out.println("Produto " + produto + " already exists.");
            }

            throw ex;

        } finally {
            if (em != null) {

                em.close();

            }
        }
    }

    public void edit(Produto produto) {
        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();

            em.getTransaction().begin();

            produto = em.merge(produto);

            em.getTransaction().commit();

        } catch (Exception ex) {

            int id = produto.getCodproduto();
            if (findProduto(id) == null) {
                System.out.println("O produto com o id " + id + " foi excluído.");
                System.out.println(ex.toString());
            }

            throw ex;

        } finally {
            if (em != null) {

                /* após a operação, a transação é finalizada */
                em.close();

            }
        }
    }

    public void destroy(int id) {
        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            em.getTransaction().begin();
            Produto produto;
            try {
                produto = em.getReference(Produto.class, id);

                em.remove(produto);

                em.getTransaction().commit();

            } catch (Exception ex) {

                System.out.println("O produto com o id" + id + " foi excluído.");
            }

        } catch (Exception e) {

            System.out.println(e);

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Produto findProduto(int id) {
        EntityManager em = this.emf.createEntityManager();
        try {

            return em.find(Produto.class, id);

        } catch (Exception e) {

            System.out.println(e);
            return null;

        } finally {
            em.close();
        }
    }

    public List<Produto> findAllProduto() {

        EntityManager em = this.emf.createEntityManager();

        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();

            cq.select(cq.from(Produto.class));
            Query q = em.createQuery(cq);

            return q.getResultList();

        } catch (Exception e) {

            System.out.println(e);
            return null;

        } finally {
            em.close();
        }
    }

    private int generatedNextId() {
        EntityManager em = this.emf.createEntityManager();

        try {
            int nextId = (int) em.createNativeQuery("SELECT prod.codproduto FROM produto prod ORDER BY prod.codproduto DESC").getResultList().get(0) + 1;
            return nextId;

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            return 1;
        }
    }

}
