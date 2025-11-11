package lt.jono.petamante_backend.entity;
import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.RelationType;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_relations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@IdClass(UserRelationId.class)  // Sudėtinis pirminis raktas
public class UserRelation {

    @Id
    @Column(name = "legal_id")
    private Long legalId;

    @Id
    @Column(name = "private_id")
    private Long privateId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "legal_id", insertable = false, updatable = false)
    private User legalUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "private_id", insertable = false, updatable = false)
    private User privateUser;

    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;

    private String position;

    @Enumerated(EnumType.STRING)
    @Column(name = "relation_type")
    private RelationType relationType;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
}