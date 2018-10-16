package com.guina.teste;

import com.guina.model.ModelPais;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 *
 * @author agnaldo
 */
public class TesteValidarPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ADMJPAModelPU");
        EntityManager em = emf.createEntityManager();
        ModelPais p = new ModelPais();
         p.setNome_pais("");
         p.setIso_pais("BRAA");
        em.getTransaction().begin();
        //Metodo de validar
        Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
        //Usa Set 
        Set<ConstraintViolation<ModelPais>> erros = validador.validate(p);
        if (erros.size() > 0) {
            for (ConstraintViolation<ModelPais> erro : erros) {
                System.out.println("Erro: " + erro.getMessage());
            }
        } else {
            em.persist(p);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
