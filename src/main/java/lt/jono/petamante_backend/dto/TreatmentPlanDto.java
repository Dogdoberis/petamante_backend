package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.TreatmentStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TreatmentPlanDto {

    private Long id;

    private Long petId;

    private Long vetDoctorId;

    private Long clinicId;

    private String title;

    private String diagnosis;

    private String treatmentGoal;

    private LocalDate startDate;

    private LocalDate endDate;

    private TreatmentStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
