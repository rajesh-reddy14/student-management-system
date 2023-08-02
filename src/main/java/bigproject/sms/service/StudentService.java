package bigproject.sms.service;

import bigproject.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public List<StudentDto> getallstduent();

    void createStudent(StudentDto studentDto);

}
