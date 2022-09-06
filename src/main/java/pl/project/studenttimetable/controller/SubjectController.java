package pl.project.studenttimetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.project.studenttimetable.model.Subject;
import pl.project.studenttimetable.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping(value = "/subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Subject>> getAll(){
        List<Subject> subjects = service.getAll();
        return ResponseEntity.ok(subjects);
    }
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Subject> getById(@PathVariable Long id){
        Subject subject = service.getById(id);
        return ResponseEntity.ok(subject);
    }

    @PostMapping(value = "/add")
    public ResponseEntity add(@RequestBody Subject subject){
        service.add(subject);
        return ResponseEntity.ok(subject);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Subject> update(@PathVariable Long id, @RequestBody Subject subject){
        Subject subject1 = service.getById(id);
        subject1.setName(subject.getName());
        subject1.setTeacher(subject.getTeacher());
        service.update(subject1);
        return ResponseEntity.ok(subject1);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Subject> delete(@PathVariable Long id){
        Subject subject1 = service.getById(id);
        service.delete(subject1);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
