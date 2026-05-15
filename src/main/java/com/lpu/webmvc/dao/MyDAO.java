package com.lpu.webmvc.dao;

import com.lpu.webmvc.model.UserDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;



@Component
public class MyDAO {
    private Session getSession(){
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
    public Boolean save(UserDTO dto){
        System.out.println("MyDAO save() has executed...");
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(dto);
        transaction.commit();
        session.close();
        return true;
    }

    public boolean loginValidation(String email, Long password) {
        Session session = getSession();
        Query query = session.createQuery("from UserDTO where email=?1 and password=?2");
        query.setParameter(1,email);
        query.setParameter(2,password);
        UserDTO dto = (UserDTO) query.uniqueResult();
        if (dto!=null) return true;
        return false;
    }
}
