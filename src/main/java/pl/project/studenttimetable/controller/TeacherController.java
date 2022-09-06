package pl.project.studenttimetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.project.studenttimetable.model.Teacher;
import pl.project.studenttimetable.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Teacher>> getAll(){
        List<Teacher> teachers = service.getAll();
        return ResponseEntity.ok(teachers);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Teacher> getById(@PathVariable Long id){
        Teacher teacher = service.getById(id);
        return ResponseEntity.ok(teacher);
    }
    @PostMapping(value = "/add")
    public ResponseEntity add(@RequestBody Teacher teacher){
        service.add(teacher);
        return ResponseEntity.ok(teacher);
    }
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Teacher> update(@PathVariable Long id, @RequestBody Teacher teacher){
        Teacher teacher1 = service.getById(id);
        teacher1.setName(teacher.getName());
        teacher1.setSurname(teacher.getSurname());
        service.update(teacher1);
        return ResponseEntity.ok(teacher1);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Teacher> delete(@PathVariable Long id){
        Teacher teacher1 = service.getById(id);
        service.delete(teacher1);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
