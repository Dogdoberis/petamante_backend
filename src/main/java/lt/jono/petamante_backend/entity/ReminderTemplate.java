package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.Channel;
import lt.jono.petamante_backend.entity.enums.ReminderType;

import java.time.LocalDateTime;

@Entity
@Table(name = "reminder_templates")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ReminderTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "reminder_type", nullable = false)
    private ReminderType reminderType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Channel channel;

    @Column(nullable = false, length = 100)
    private String subject; // tik EMAIL

    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private String template; // Thymeleaf/Freemarker šablonas

    @Column(name = "is_active")
    private boolean isActive = true;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    // Unikalus tipas + kanalas
    @PrePersist
    @PreUpdate
    private void validateUnique() {
        // Gali būti patikrinta per DB constraint
    }
}
