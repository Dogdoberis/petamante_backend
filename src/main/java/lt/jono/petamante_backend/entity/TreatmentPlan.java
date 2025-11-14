package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.TreatmentStatus;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "treatment_plans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TreatmentPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vet_doctor_id", nullable = false)
    private User vetDoctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clinic_id")
    private User clinic;

    @Column(nullable = false, length = 100)
    private String title; // "Širdies nepakankamumo gydymas"

    @Lob
    @Column(columnDefinition = "TEXT")
    private String diagnosis; // "Lėtinis širdies nepakankamumas"

    @Lob
    @Column(columnDefinition = "TEXT")
    private String treatmentGoal; // "Sumažinti simptomus, pagerinti gyvenimo kokybę"

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TreatmentStatus status = TreatmentStatus.ACTIVE;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // === RYŠIAI ===
    @OneToMany(mappedBy = "treatmentPlan", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TreatmentPlanItem> tasks = new HashSet<>();

    @OneToMany(mappedBy = "treatmentPlan", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<HealthRecord> healthRecords = new HashSet<>();
}
