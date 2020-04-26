package com.cg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AutUtil {
    private static EntityManager em;
	public static EntityManager getEntityManager() {
		if(em==null)
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("authentity");
			em=emf.createEntityManager();
		}
		return em;
	}

}
