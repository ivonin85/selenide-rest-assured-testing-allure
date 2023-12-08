package rf.ivonin.dto.userListDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import rf.ivonin.dto.generalDTO.SupportDTO;
import rf.ivonin.dto.generalDTO.UserDataDTO;

import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserListDTO {
    @JsonProperty("per_page")
    private int perPage;
    private int total;
    private List<UserDataDTO> data;
    private int page;
    @JsonProperty("total_pages")
    private int totalPages;
    private SupportDTO support;
}
