package Inheritance;

import javax.persistence.*;  

  
public class Main {  
      
    public static void main(String[] args) {  
          
      
  
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_Practice");  
    EntityManager em=emf.createEntityManager();  
      
    em.getTransaction().begin();  
      
      
    CurrentEmployee ae1=new CurrentEmployee(101,"Nandit",100000,5);  
    CurrentEmployee ae2=new CurrentEmployee(102,"Shail",120000,7);  
  
    RetiredEmployee re1=new RetiredEmployee(103,"Dhanesh",15000);  
    RetiredEmployee re2=new RetiredEmployee(104,"Suhag",15000);  
  
    em.persist(ae1);  
    em.persist(ae2);  
      
    em.persist(re1);  
    em.persist(re2);  
      
    em.getTransaction().commit();  
      
    em.close();  
    emf.close();  
      
}}  