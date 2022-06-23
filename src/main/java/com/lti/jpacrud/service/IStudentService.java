package com.lti.jpacrud.service;

import java.util.List;

import com.lti.jpacrud.entities.Student;
import com.lti.jpacrud.exceptions.StudentException;
//import com.lti.jpacrud.exceptions.StudentException;

public interface IStudentService {

	public abstract List<Student> listStudent() throws StudentException;

	public abstract Student findStudentById(Integer id) throws StudentException;

	public abstract Student addStudent(Student student) throws StudentException;

	public abstract Student removeStudent(Student student) throws StudentException;

	public abstract Student updateStudent(Student student) throws StudentException;

}