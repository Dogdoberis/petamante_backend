package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentReminderDto {

    private Long id;

    private Long paymentId;

    private Long userId;

    private LocalDateTime scheduledAt;

    private LocalDateTime sentAt;

    private boolean sent;

    // TODO: add fields to match PaymentReminder entity (type, channel, status, etc.)
}
