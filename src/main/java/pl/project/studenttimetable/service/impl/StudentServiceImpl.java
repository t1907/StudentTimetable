package pl.project.studenttimetable.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.studenttimetable.model.Student;
import pl.project.studenttimetable.repository.StudentRepository;
import pl.project.studenttimetable.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student studentFromDB = studentRepository
                .findById(student.getId())
                .orElseThrow();
        studentFromDB.setName(student.getName());
        studentFromDB.setSurname(student.getSurname());
        return studentRepository.save(studentFromDB);
    }

    @Override
    public void deleteStudent(Student student) {
        Student studentFromDB = studentRepository
                .findById(student.getId())
                .orElseThrow();
        studentRepository.delete(studentFromDB);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
