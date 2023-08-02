package bigproject.sms.mapper;

import bigproject.sms.dto.StudentDto;
import bigproject.sms.entity.Student;

public class StudentMapper {
    public static StudentDto maptoStudentDto(Student student)
    {
        StudentDto studentDto=new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
        return studentDto;
    }
    public static  Student maptoStdudent(StudentDto studentDto)
    {
        Student student=new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
        return student;
    }
}
