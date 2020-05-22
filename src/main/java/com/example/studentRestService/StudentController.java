package com.example.studentRestService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController

public class StudentController {
    @Autowired
    CreateStudent createStudent;

    @Autowired
    GetStudent getStudent;


    @RequestMapping(method= RequestMethod.POST, path="/createstudent")
    public String postStudent(@PathParam("admissionnumber") String admissionnumber,@PathParam("fullname") String fullname,@PathParam("programme") String programme){
        return createStudent.CreateStudentData(admissionnumber,fullname,programme);
    }
    @RequestMapping(method=RequestMethod.GET, path="/findstudent")
    public Optional<Student> findStudent(@PathParam("studentid") Integer studentid){
        return getStudent.findById(studentid);
    }
    @RequestMapping(method=RequestMethod.GET, path="/findallstudentsiterable")
    public Iterable<Student> findallStudent(){
        return getStudent.findAll();
    }
    @RequestMapping(method=RequestMethod.GET, path="/findallstudentslist")
    public List<Student> findallStudents(){
        return (List<Student>) getStudent.findAll();
    }
    /*<editor-fold desc="Description">
    @RequestMapping(method=RequestMethod.DELETE, path="/deleteallstudents")
    public void deleteAllStudent(){
         getStudent.deleteAll();
    }
    //</editor-fold>*/


}
