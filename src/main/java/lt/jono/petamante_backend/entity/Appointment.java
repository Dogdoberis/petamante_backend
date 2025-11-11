package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.AppointmentStatus;
import lt.jono.petamante_backend.entity.enums.ServiceType;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Klinika (juridinis asmuo)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "legal_id")
    private User legal;

    // Gydytojas / specialistas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vet_doctor_id")
    private User vetDoctor;

    // Augintinis
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    private Pet pet;

    // Savininkas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    // Kas sukūrė užklausą
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id", nullable = false)
    private User createdBy;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentStatus status = AppointmentStatus.SCHEDULED;

    @Column(name = "appointment_date", nullable = false)
    private LocalDateTime appointmentDate;

    @Column(nullable = false)
    private Integer duration = 30; // minutėmis

    @Column(length = 255)
    private String reason;

    @Column(length = 500)
    private String notes;

    @Enumerated(EnumType.STRING)
    @Column(name = "service_type")
    private ServiceType serviceType;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
}
