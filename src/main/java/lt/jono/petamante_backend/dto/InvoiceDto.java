package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.InvoiceStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceDto {

    private Long id;

    private Long paymentId;

    private Long userId;

    private String invoiceNumber;

    private LocalDate issueDate;

    private LocalDate dueDate;

    private BigDecimal amount;

    private InvoiceStatus status;

    private String fileUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
