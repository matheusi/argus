package br.com.pbd.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    private static EntityManagerFactory entityManagerFactory;
    
    public static EntityManagerFactory conexao(){
    return entityManagerFactory = Persistence.createEntityManagerFactory("ArgusPU");
}
}
