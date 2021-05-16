package com.kapadne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapadne.dao.SubjectDao;
import com.kapadne.exception.SubjectNotFoundException;
import com.kapadne.model.Subject;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/rest/api/")
public class SubjectController {
	
	@Autowired
    private SubjectDao subjectDao;

    // get all subject details
    @GetMapping("/subjects")
    public List < Subject > getAllEmployees() {
        return subjectDao.findAll();
    }
    
    // save subject data in DB
    @PostMapping("/saveSubject")
    public Subject createEmployee(@RequestBody Subject subject) {
        return subjectDao.save(subject);
    }
    
 /*// get employee by id rest api
    @GetMapping("/employees/{id}")
    public ResponseEntity < Subject > getEmployeeById(@PathVariable Long id) {
        Subject subject = subjectDao.findById(id)
        		.orElseThrow(() -> new MeetingDoesNotExistException(meetingId));
        		//.orElseThrow(() - > new SubjectNotFoundException("Subject not exist with id :" + id));
        		
            //.orElseThrow(() - > new SubjectNotFoundException("Subject not exist with id :" + id));
        return ResponseEntity.ok(subject);
    }
*/
}
