package com.example.jfs_data_jpa;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    // Instance
    private final StudentRepository studentRepository;

    //constructor
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
//getStudent method
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    //findOne method
    public Optional<Student> findOne(Long studentId) {
        return studentRepository.findById(studentId);
    }
    //findByName method
    public List<Student> findByName(String studentName) {
        return studentRepository.findByName(studentName);
    }
    //addStudent method
    public void addStudent(Student student) {
       studentRepository.save(student);
    }
// deleteStudent method
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}

