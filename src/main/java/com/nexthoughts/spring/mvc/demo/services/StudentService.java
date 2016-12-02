package com.nexthoughts.spring.mvc.demo.services;

import com.nexthoughts.spring.mvc.demo.classes.StudentCommand;
import com.nexthoughts.spring.mvc.demo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService {

    private SessionFactory sessionFactory;

    @Autowired
    public StudentService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }


    public int create(StudentCommand studentCommand) {
        Student student = new Student(studentCommand);
        getSession().save(student);
        getSession().close();
        return student.getId();
    }

    public int update(StudentCommand studentCommand) {
        Student student = new Student(studentCommand);
        getSession().update(student);
        getSession().close();
        return student.getId();
    }

    public List<StudentCommand> list() {
        List<Student> studentList = getSession().createCriteria(Student.class).list();
        List<StudentCommand> studentResponseList = new ArrayList<>();
        StudentCommand responseStudent = null;
        for (Student student : studentList) {
            responseStudent = new StudentCommand(student);
            studentResponseList.add(responseStudent);
        }
        getSession().close();
        return studentResponseList;
    }

    public Student read(Integer id) {
        Student student = (Student) getSession().get(Student.class, id);
        return student;
    }

    public void delete(StudentCommand studentCommand) {
        Student student = new Student(studentCommand.getId());
        getSession().delete(student);
        getSession().close();
    }
}
