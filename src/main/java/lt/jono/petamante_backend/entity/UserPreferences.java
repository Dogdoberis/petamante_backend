package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "user_preferences")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    // === BENDRIEJI NUSTATYMAI ===
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Language language = Language.LT;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Theme theme = Theme.AUTO;

    @Column(name = "timezone", length = 50)
    private String timezone = "Europe/Vilnius";

    @Column(name = "date_format", length = 20)
    private String dateFormat = "yyyy-MM-dd";

    @Column(name = "time_format", length = 10)
    private String timeFormat = "HH:mm";

    // === PRANEŠIMAI ===
    @ElementCollection
    @CollectionTable(name = "user_notification_channels", joinColumns = @JoinColumn(name = "preference_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "channel")
    private Set<Channel> notificationChannels = new HashSet<>(
            Set.of(Channel.EMAIL, Channel.IN_APP)
    );

    @Column(name = "notify_reminders")
    private boolean notifyReminders = true;

    @Column(name = "notify_appointments")
    private boolean notifyAppointments = true;

    @Column(name = "notify_invoices")
    private boolean notifyInvoices = true;

    @Column(name = "notify_marketing")
    private boolean notifyMarketing = false;

    // === PRIVATUMAS ===
    @Column(name = "profile_visibility", length = 20)
    private String profileVisibility = "PRIVATE"; // PUBLIC, FRIENDS, PRIVATE

    @Column(name = "show_email")
    private boolean showEmail = false;

    @Column(name = "show_phone")
    private boolean showPhone = false;

    // === KITA ===
    @Lob
    @Column(name = "custom_settings", columnDefinition = "JSONB")
    private String customSettings; // JSON: {"dashboard": "calendar", "units": "kg"}

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
}