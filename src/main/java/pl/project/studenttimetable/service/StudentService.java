package pl.project.studenttimetable.service;


import pl.project.studenttimetable.model.Student;

import java.util.List;

public interface StudentService {
    public Student add(Student student);
    public Student update(Student student);
    public void delete(Student student);
    public Student getById(Long id);
    public List<Student> getAll();
}
