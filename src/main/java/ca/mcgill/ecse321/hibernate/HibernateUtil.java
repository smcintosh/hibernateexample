package ca.mcgill.ecse321.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;

import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

  private static final SessionFactory sessionFactory;

  static {
    final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
    sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
  }

  public static Session getSession() {
    return sessionFactory.openSession();
  }
}
