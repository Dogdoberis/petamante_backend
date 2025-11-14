package lt.jono.petamante_backend.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionPlanDto {

    private Long id;

    private String name;

    private BigDecimal priceMonthly;

    private BigDecimal priceYearly;

    private Integer trialDays;

    private boolean free;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
