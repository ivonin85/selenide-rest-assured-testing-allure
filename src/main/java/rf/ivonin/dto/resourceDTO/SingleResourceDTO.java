package rf.ivonin.dto.resourceDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;
import rf.ivonin.dto.generalDTO.ResourceDataDTO;
import rf.ivonin.dto.generalDTO.SupportDTO;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleResourceDTO {
    private ResourceDataDTO data;
    private SupportDTO support;
}
