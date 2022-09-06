package pl.project.studenttimetable.service;


import pl.project.studenttimetable.model.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Student student);
    public Student getStudentById(Long id);
    public List<Student> getAll();
}
