package lt.jono.petamante_backend.entity;
import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.ChangeReason;

import java.time.LocalDateTime;

@Entity
@Table(name = "pet_ownership_history")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class PetOwnershipHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    // Gali būti NULL – pirmam įrašui (kai augintinis sukurtas)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "old_owner_id")
    private User oldOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "new_owner_id", nullable = false)
    private User newOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "changed_by_id", nullable = false)
    private User changedBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "change_reason", nullable = false)
    private ChangeReason changeReason;

    @Column(name = "changed_at", nullable = false, updatable = false)
    private LocalDateTime changedAt = LocalDateTime.now();
}
