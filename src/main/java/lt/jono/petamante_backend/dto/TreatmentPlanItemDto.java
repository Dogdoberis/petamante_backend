package lt.jono.petamante_backend.dto;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TreatmentPlanItemDto {

    private Long id;

    private Long treatmentPlanId;

    private String name;

    private String dosage;

    private String instructions;

    private String frequency;

    private LocalDate startDate;

    private LocalDate endDate;

    private boolean completed;

    private LocalDateTime completedAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
