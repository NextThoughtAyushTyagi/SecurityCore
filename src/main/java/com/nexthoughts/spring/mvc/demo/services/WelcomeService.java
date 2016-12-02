package com.nexthoughts.spring.mvc.demo.services;

import com.nexthoughts.spring.mvc.demo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WelcomeService {

    private SessionFactory sessionFactory;

    @Autowired
    public WelcomeService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public String getTitle() {
        return "Title from welcome service";
    }

    public String getMessage() {
        return "Message from welcome service";
    }


    public void saveOrUpdateStudent(Student student) {
        sessionFactory.openSession().saveOrUpdate(student);
    }
}
