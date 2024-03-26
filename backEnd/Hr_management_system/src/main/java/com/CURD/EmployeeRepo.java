package com.CURD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Integer> {
    @Query(value = "SELECT COUNT(*) FROM employeedata.employee_details WHERE gender = 'Male'", nativeQuery = true)
    long countMaleEmployees();

    @Query(value = "SELECT COUNT(*) FROM employeedata.employee_details WHERE gender = 'Female'", nativeQuery = true)
    long countFemaleEmployees();
}
