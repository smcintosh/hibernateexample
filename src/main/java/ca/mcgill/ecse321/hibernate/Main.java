package ca.mcgill.ecse321.hibernate;

import org.hibernate.Session;

public class Main {

  public static void main(String[] args) {
    /* Connect to the DB and begin an atomic operation */
    Session session = HibernateUtil.getSession();
    session.beginTransaction();

    /* Create an example student */
    Student student = new Student();
    student.setStudentId(260699808);
    student.setGivenName("Shane");
    student.setFamilyName("McIntosh");
    student.setMajor("Software Engineering");

    /* Write the student to the DB by committing the transaction */
    session.saveOrUpdate(student);
    session.getTransaction().commit();

    session.close();
  }
}
