package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.PaymentMethod;
import lt.jono.petamante_backend.entity.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDto {

    private Long id;

    private Long subscriptionId;

    private BigDecimal amount;

    private String currency;

    private PaymentStatus status;

    private PaymentMethod paymentMethod;

    private String provider;

    private String providerPaymentId;

    private LocalDateTime paidAt;

    private LocalDateTime createdAt;
}
