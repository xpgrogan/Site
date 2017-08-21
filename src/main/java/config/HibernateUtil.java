package config;

import beans.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {

    private static SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

    public static Session getSession(){
        return sessionFactory.openSession();
    }
}