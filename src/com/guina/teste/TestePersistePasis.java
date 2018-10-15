package com.guina.teste;

import com.guina.model.ModelPais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author agnaldo
 */
public class TestePersistePasis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ADMJPAModelPU");
        EntityManager em = emf.createEntityManager();
        ModelPais p = new ModelPais();
        p.setNome_pais("Paraguai");
        p.setIso_pais("BRA");
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
