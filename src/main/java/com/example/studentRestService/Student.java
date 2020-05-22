package com.example.studentRestService;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    @Column(name="studentid")
    private Integer studentId;
    
    @Column(name="admissionnumber")
    private String admissionNumber;

    @Column(name="fullname")
    private String fullName;

    @Column(name="programme")
    private String programme;

    protected Student(){

}

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", admissionNumber='" + admissionNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setProgramme(String programme){
        this.programme = programme;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public String getAdmissionNumber() {
        return admissionNumber;
    }
    public String getFullName() {
        return fullName;
    }
    public String getProgramme(){
        return programme;
    }

}
