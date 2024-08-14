package org.example.pavlichenko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Main {

    private static final SessionFactory sessionFactory = new Configuration()
            .addPackage("org.example.pavlichenko.dao")
            .buildSessionFactory();

    public static void main(String[] args) {

        try (Session session = sessionFactory.openSession()){
            NativeQuery<Long> nativeQuery = session.createNativeQuery("SELECT count(*) FROM film");
            System.out.println(nativeQuery.getSingleResult());

        }

    }
}