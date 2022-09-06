package pl.project.studenttimetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.studenttimetable.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
