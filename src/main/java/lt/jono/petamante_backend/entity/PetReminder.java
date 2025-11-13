package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pet_reminders")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class PetReminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @Enumerated(EnumType.STRING)
    @Column(name = "reminder_type", nullable = false)
    private PetReminderType reminderType;

    @Column(name = "title", nullable = false, length = 100)
    private String title; // "Reksui – skiepai nuo pasiutligės"

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;

    @Column(name = "remind_at")
    private LocalDate remindAt; // pvz. 3 dienos prieš

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PetReminderStatus status = PetReminderStatus.PENDING;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Channel channel = Channel.EMAIL;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    // Ryšys su HealthRecord (jei priminimas susietas su įrašu)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "health_record_id")
    private HealthRecord healthRecord;
}