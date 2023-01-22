package uz.sodiqdev.appjpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.sodiqdev.appjpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
