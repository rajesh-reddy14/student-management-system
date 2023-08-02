package bigproject.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message = "first name cant be empty")
    private String firstName;
    @NotEmpty(message = "student Last name should not empty")
    private String lastName;
    @NotEmpty(message = "email cant be empty")
    @Email
    private String email;
}
