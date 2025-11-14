package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "treatment_tasks")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class TreatmentPlanItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "treatment_plan_id", nullable = false)
    private TreatmentPlan treatmentPlan;

    @Column(nullable = false, length = 100)
    private String name; // "Vetmedin 1.25mg"

    @Column(length = 500)
    private String dosage; // "1 tabletė 2x per dieną"

    @Column(length = 500)
    private String instructions; // "Duoti su maistu"

    @Column(name = "frequency", length = 50)
    private String frequency; // "Kas 12 val.", "Kas savaitę"

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_completed")
    private boolean isCompleted = false;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
}