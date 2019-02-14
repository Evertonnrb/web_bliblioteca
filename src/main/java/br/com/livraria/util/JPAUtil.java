package br.com.livraria.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public class JPAUtil {


    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("default");
    }

    public static EntityManager getEmf() {
        return emf.createEntityManager();
    }

    public static void closeEmf(){
        emf.close();
    }
}
