package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UnavailableSlotDto {

    private Long id;

    private Long userId; // vet/clinic

    private LocalDateTime start;

    private LocalDateTime end;

    private String reason;

    // TODO: add fields to match UnavailableSlot entity
}
