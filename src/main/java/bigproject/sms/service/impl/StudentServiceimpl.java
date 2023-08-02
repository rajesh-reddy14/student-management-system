package bigproject.sms.service.impl;

import bigproject.sms.dto.StudentDto;
import bigproject.sms.entity.Student;
import bigproject.sms.mapper.StudentMapper;
import bigproject.sms.repository.StudentRepository;
import bigproject.sms.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<StudentDto> getallstduent() {
        List<Student>re=studentRepository.findAll();
        List<StudentDto>ne=re.stream().map((student)-> StudentMapper.maptoStudentDto(student)).collect(Collectors.toList());
        return ne;
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.maptoStdudent(studentDto));
    }
}
