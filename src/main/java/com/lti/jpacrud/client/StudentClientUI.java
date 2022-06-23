package com.lti.jpacrud.client;

import java.util.List;
import java.util.Scanner;

import com.lti.jpacrud.entities.Student;
import com.lti.jpacrud.exceptions.StudentException;
import com.lti.jpacrud.service.IStudentService;
import com.lti.jpacrud.service.StudentService;
import com.lti.util.JPAUtil;

public class StudentClientUI {

	static IStudentService service = new StudentService();


	public static void studentClientUI(String[] args) throws StudentException {

		Scanner sc = new Scanner(System.in);
		Integer number = 0;
		Student student = new Student();
		Integer id= (int)(1000+Math.random()*1234.1234);


		System.out.println("Enter Choice! 1. Create 2. Retrieve  3. Update 4. Delete");
		number = sc.nextInt();
		switch(number){
			case 1:
				//Uniquely Persisted using Sequence
//				System.out.println("Enter Student Id");
//				id = sc.nextInt();
//				student.setStudentId(id);

				System.out.println("Enter Student Name");
				String name=sc.next();
				student.setName(name);

				//Create
				Student persistedStudent= service.addStudent(student);
				Integer studentId = persistedStudent.getStudentId();

				if(studentId>0) {
					System.out.println("Student persisted with unique ID " + studentId );
				}
				//at this breakpoint, we have added one record to table
				List<Student> studentList = service.listStudent();
				if(studentList!=null) {
					System.out.println("List of Students");
					studentList.forEach((s1)->System.out.println(s1));;
				}
				else {
					System.out.println("No Records Found");
				}
				break;
			case 2:
				//Retrieve
				System.out.println("Enter ID to be retrieved");
				id = sc.nextInt();
				student = service.findStudentById(id);
				System.out.print("ID:"+student.getStudentId());
				System.out.println(" Name:"+student.getName());
				break;
			case 3:
				//Update but which? so Retrieve then update then retrieve again to display update

				System.out.println("Retrieve ID of student to be updated");
				id = sc.nextInt();
				student = service.findStudentById(id);
				System.out.print("ID:"+student.getStudentId());
				System.out.println(" Name:"+student.getName());

				System.out.println("Enter Name of student");
				student.setName(sc.next());
				service.updateStudent(student);

				//at this breakpoint, we have updated record added in first section
				student = service.findStudentById(id);
				System.out.print("ID:"+student.getStudentId());
				System.out.println(" Name:"+student.getName());
				break;
			case 4:
				//Delete
				//at this breakpoint, record is removed from table
				System.out.println("Retrieve ID of student to be deleted");
				id = sc.nextInt();
				student = service.findStudentById(id);
				service.removeStudent(student);
				System.out.println("Student Deleted from records");
				break;


		}

		System.out.println("End of program...");
		JPAUtil.closeEntityManager();
	}
}
