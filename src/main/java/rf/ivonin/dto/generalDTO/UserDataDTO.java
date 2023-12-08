package rf.ivonin.dto.generalDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataDTO {
    @JsonProperty("last_name")
    private String lastName;
    private int id;
    private String avatar;
    @JsonProperty("first_name")
    private String firstName;
    private String email;
}