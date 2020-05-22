package com.example.studentRestService;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CreateStudent {
    @PersistenceContext
    private EntityManager entityManager;

    public String CreateStudentData(String admissionNumber, String fullName, String programme ){
        Student student = new Student();
        student.setAdmissionNumber(admissionNumber);
        student.setFullName(fullName);
        student.setProgramme(programme);

        entityManager.persist(student);

        return student.toString();
    }
}
