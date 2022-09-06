package pl.project.studenttimetable.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.studenttimetable.model.Teacher;
import pl.project.studenttimetable.repository.TeacherRepository;
import pl.project.studenttimetable.service.TeacherService;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher add(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        Teacher teacherFromDB = teacherRepository
                .findById(teacher.getId())
                .orElseThrow();
        teacherFromDB.setName(teacher.getName());
        teacherFromDB.setSurname(teacher.getSurname());
        return teacherRepository.save(teacherFromDB);
    }

    @Override
    public void delete(Teacher teacher) {
        Teacher teacherFromDB = teacherRepository
                .findById(teacher.getId())
                .orElseThrow();
        teacherRepository.delete(teacherFromDB);
    }

    @Override
    public Teacher getById(Long id) {
        return teacherRepository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }
}
