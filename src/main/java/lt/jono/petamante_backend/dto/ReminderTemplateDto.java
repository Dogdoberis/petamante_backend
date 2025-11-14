package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.Channel;
import lt.jono.petamante_backend.entity.enums.ReminderType;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReminderTemplateDto {

    private Long id;

    private ReminderType reminderType;

    private Channel channel;

    private String subject;

    private String template;

    private boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
