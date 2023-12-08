package rf.ivonin.dto.generalDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceDataDTO {
    private String color;
    private int year;
    private String name;
    private int id;
    @JsonProperty("pantone_value")
    private String pantoneValue;
}
