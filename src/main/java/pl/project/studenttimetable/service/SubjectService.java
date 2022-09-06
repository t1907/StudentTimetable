package pl.project.studenttimetable.service;

import pl.project.studenttimetable.model.Subject;

import java.util.List;

public interface SubjectService {
    public Subject add(Subject subject);
    public Subject update(Subject subject);
    public void delete(Subject subject);
    public Subject getById(Long id);
    public List<Subject> getAll();
}
