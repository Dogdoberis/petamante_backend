package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "subscription_plans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name; // "Pro", "Shelter Free", "Premium"

    @Column(name = "price_monthly", precision = 8, scale = 2)
    private BigDecimal priceMonthly;

    @Column(name = "price_yearly", precision = 8, scale = 2)
    private BigDecimal priceYearly;

    @Column(name = "trial_days")
    private Integer trialDays = 30;

    @Column(name = "is_free")
    private boolean isFree = false;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
}