package pl.project.studenttimetable.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.project.studenttimetable.model.Student;
import pl.project.studenttimetable.model.Subject;
import pl.project.studenttimetable.repository.SubjectRepository;
import pl.project.studenttimetable.service.SubjectService;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Subject add(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject update(Subject subject) {
        Subject subjectFromDB = subjectRepository
                .findById(subject.getId())
                .orElseThrow();
        subjectFromDB.setName(subject.getName());
        subjectFromDB.setTeacher(subject.getTeacher());
        return subjectRepository.save(subjectFromDB);
    }

    @Override
    public void delete(Subject subject) {
        Subject subjectFromDB = subjectRepository
                .findById(subject.getId())
                .orElseThrow();
        subjectRepository.delete(subjectFromDB);
    }

    @Override
    public Subject getById(Long id) {
        return subjectRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }
}
