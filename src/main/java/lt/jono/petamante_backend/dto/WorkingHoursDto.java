package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkingHoursDto {

    private Long id;

    private Long userId;

    private Integer dayOfWeek; // 1–7 or 0–6 depending on entity

    private LocalTime startTime;

    private LocalTime endTime;

    private boolean closed;

    // TODO: add fields to match WorkingHours entity
}
