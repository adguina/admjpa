package com.guina.teste;

import com.guina.model.ModelPais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author agnaldo
 */
public class TesteAlterarPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ADMJPAModelPU");
        EntityManager em = emf.createEntityManager();
        
        ModelPais p = em.find(ModelPais.class,3); //carrega o pais
        p.setIso_pais("PAR");//alterando a iso
        em.getTransaction().begin(); //inicia uma transacao
        em.merge(p);//metodo que alterar
        em.getTransaction().commit();
        em.close();
        emf.close();
       
    }

}
