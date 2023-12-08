package rf.ivonin.dto.registerDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterDTO {
    private String password;
    private String email;
    private int id;
    private String token;
}