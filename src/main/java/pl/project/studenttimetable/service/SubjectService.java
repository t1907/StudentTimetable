package pl.project.studenttimetable.service;

import pl.project.studenttimetable.model.Subject;

import java.util.List;

public interface SubjectService {
    public Subject addSubject(Subject subject);
    public Subject updateSubject(Subject subject);
    public void deleteSubject(Subject subject);
    public Subject getSubjectById(Long id);
    public List<Subject> getAll();
}
