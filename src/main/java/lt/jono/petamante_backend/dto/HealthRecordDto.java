package lt.jono.petamante_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HealthRecordDto {

    private Long id;

    private Long treatmentPlanId;

    // čia įdėk likusius laukus iš HealthRecord entitės
}
