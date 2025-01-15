package com.example.Email_Verification.repository;

import com.example.Email_Verification.entity.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findById(Long  Id);


    @Query(value = "SELECT MAX(Salary) FROM Employee WHERE Salary < (SELECT MAX(Salary) FROM Employee)", nativeQuery = true)
    Double findSecondHighestSalary();

}
