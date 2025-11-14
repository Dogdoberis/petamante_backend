package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.PetReminderStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetReminderDto {

    private Long id;

    private Long petId;

    private Long ownerId;

    private String title;

    private String message;

    private LocalDateTime remindAt;

    private PetReminderStatus status;

    // TODO: add fields to match PetReminder entity (type, channel, etc.)
}
