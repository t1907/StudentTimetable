package pl.project.studenttimetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.studenttimetable.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
