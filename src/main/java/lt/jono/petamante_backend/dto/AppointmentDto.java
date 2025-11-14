 package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.AppointmentStatus;
import lt.jono.petamante_backend.entity.enums.ServiceType;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDto {

    private Long id;

    private Long legalId;

    private Long vetDoctorId;

    private Long petId;

    private Long ownerId;

    private Long createdById;

    private AppointmentStatus status;

    private LocalDateTime appointmentDate;

    private Integer duration;

    private String reason;

    private String notes;

    private ServiceType serviceType;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
