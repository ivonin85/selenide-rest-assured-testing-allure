package rf.ivonin.dto.createDTO;

import lombok.Data;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserDTO {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
