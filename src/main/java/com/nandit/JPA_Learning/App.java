package com.nandit.JPA_Learning;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.List;

import javax.persistence.*;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	Students s1 = new Students();
//    	s1.setCountry("Canada");
//    	s1.setName("Nancy");
//    	s1.setId(55);
//    	
//    	Students s2 = new Students();
//    	s2.setCountry("America");
//    	s2.setName("Nigam");
//    	s2.setId(39);
//
//    	Students s3 = new Students();
//    	s3.setCountry("Canada");
//    	s3.setName("Viral");
//    	s3.setId(49);
//    	
//    	Students s4 = new Students();
//    	s4.setCountry("Germany");
//    	s4.setName("Nandit");
//    	s4.setId(1);
//       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Practice");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
//        em.persist(s1);
//        em.persist(s2);
//        em.persist(s3);
//        em.persist(s4);
        
//    	Students findedStudent = em.find(Students.class, 55);
//        System.out.println("Before Updatting"+findedStudent);
//        
//        findedStudent.setCountry("Germany");
//
//        System.out.println("After Updatting"+findedStudent);
//        
//        
//        Students queryStudent = em.find(Students.class,39);
//        em.remove(queryStudent);
        
        
        
//        Query query = em.createQuery("select s.country from Students s");
//        
//        List<String> countries = query.getResultList();
//        for(String country:countries) {
//        	System.out.println(country);
//        }
        
        
//        Query query = em.createQuery("select s from Students s");
//        
//        List<Students> students = (List<Students>) query.getResultList();
//        for(Students student:students) {
//        	System.out.println(student);
//        }
        
        
//        	Query query = em.createQuery("update Students s set s.country='Germany' where s.id=55");
//        	query.executeUpdate();

        
//        Query query = em.createQuery("delete Students s where s.id=39");
//        query.executeUpdate();
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        

        
        
    }
}
