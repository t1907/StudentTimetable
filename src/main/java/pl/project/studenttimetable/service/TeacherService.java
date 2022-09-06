package pl.project.studenttimetable.service;

import pl.project.studenttimetable.model.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher add(Teacher teacher);
    public Teacher update(Teacher teacher);
    public void delete(Teacher teacher);
    public Teacher getById(Long id);
    public List<Teacher> getAll();
}
