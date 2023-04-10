package com.example.demo.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
// JpaRepository <T, ID>
// T is the entity class, that we want to work with
// ID is the type of the primary key of the entity class, So in our case, it's Long (id)


// Connect things using dependency injection
@Repository // This interface is for data access
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    // SELECT * FROM student WHERE email = ?
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
