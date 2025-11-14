package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.RecommendationCategory;
import lt.jono.petamante_backend.entity.enums.Species;

import java.time.LocalDateTime;

@Entity
@Table(name = "recommendation_templates")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class RecommendationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title; // "Šunų širdies nepakankamumo dieta"

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private RecommendationCategory category;

    @Enumerated(EnumType.STRING)
    @Column(name = "species")
    private Species species; // NULL = visoms rūšims

    @Column(name = "breed", length = 100)
    private String breed; // NULL = visoms veislėms

    @Column(name = "age_from_months")
    private Integer ageFromMonths; // pvz. 6 mėn.

    @Column(name = "age_to_months")
    private Integer ageToMonths; // pvz. 84 mėn. (7 metai)

    @Lob
    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content; // Thymeleaf šablonas arba paprastas tekstas

    @Column(name = "is_active")
    private boolean isActive = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id")
    private User createdBy; // klinika ar veterinaras

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
}