package ru.pirozhkov.interview.spring.repositories;

import org.springframework.stereotype.Repository;
import ru.pirozhkov.interview.spring.entity.Student;

import java.util.List;


public interface StudentRepository {

    public List<Student> getAllStudents ();

    public void saveStudent (Student student);

    public Student getStudent (int id);

    public void deleteStudent (int id);
}
