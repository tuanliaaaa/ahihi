package Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Student.Model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, String>{



}
