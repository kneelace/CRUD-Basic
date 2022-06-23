DROP TABLE Student;

CREATE TABLE Student
(student_id NUMBER(6) PRIMARY KEY,
student_name VARCHAR2(25));

select * from student;

drop table student;

--using in-built java sequence

create sequence seq_student
start with 100