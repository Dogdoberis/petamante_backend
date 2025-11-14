package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSubscriptionDto {

    private Long id;

    private Long userId;

    private Long subscriptionPlanId;

    private LocalDate startDate;

    private LocalDate endDate;

    private boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // TODO: add fields to match UserSubscription entity (status, trial flags, etc.)
}
