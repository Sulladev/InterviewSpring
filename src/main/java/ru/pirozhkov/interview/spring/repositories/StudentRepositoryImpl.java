package ru.pirozhkov.interview.spring.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.pirozhkov.interview.spring.entity.Student;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        List<Student> students = session.createQuery("from Student", Student.class).getResultList();
        return students;
    }
}
