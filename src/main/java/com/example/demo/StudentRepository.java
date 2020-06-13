package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,String>{
    /**Se agregan algunos ejemplos para observar como funcinan las consultas en
     * jpa obteniendo diferentes resultados
     */

    @Query("SELECT t.name FROM Student t where t.id = :id")
    public Optional<String> findNameById(@Param("id") String id);

    @Query("SELECT * FROM Student t where t.id = :id")
    public Optional<Student> findById(@Param("id")String id);

    @Query("SELECT * FROM Student t where t.id = ?1 AND t.department = ?2")
    public Optional<Student> findByNameAndDepartment(String name, String department);

    @Query("SELECT * FROM Student t where t.name = %?1%")
    public Optional<Student> findByCriteria(String criteria);
    
}