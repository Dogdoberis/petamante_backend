package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.AdoptionStatus;
import lt.jono.petamante_backend.entity.enums.DeactivationReason;

import lt.jono.petamante_backend.entity.HealthRecord;
import lt.jono.petamante_backend.entity.Listing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Pet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "owner_id", nullable = false)
  private User owner;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "clinic_id")
  private User clinic;

  @Column(nullable = false, length = 50)
  private String name;

  @Column(nullable = false, length = 50)
  private String species;

  @Column(length = 50)
  private String breed;

  private LocalDate birthDate;

  @Column(name = "is_active")
  private boolean isActive = true;

  @Enumerated(EnumType.STRING)
  @Column(name = "deactivation_reason")
  private DeactivationReason deactivationReason;

  @Column(name = "deactivation_date")
  private LocalDateTime deactivationDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "adoption_status")
  private AdoptionStatus adoptionStatus = AdoptionStatus.NOT_APPLICABLE;

  @Column(name = "pedigree_info", length = 500)
  private String pedigreeInfo;

  @Column(name = "is_for_sale")
  private boolean isForSale = false;

  @Column(name = "chip_id", unique = true, length = 50)
  private String chipId;

  @Column(name = "lost_reported_at")
  private LocalDateTime lostReportedAt;

  @Column(name = "share_contact")
  private boolean shareContact = true;

  @Column(name = "last_owner_change_at")
  private LocalDateTime lastOwnerChangeAt;

  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt = LocalDateTime.now();

  private LocalDateTime updatedAt;

  // === RYŠIAI SU KITOMIS LENTELĖMIS (nebūtina, bet patogu) ===
  @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<PetPhoto> photos = new HashSet<>();

  @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<HealthRecord> healthRecords = new HashSet<>();

  @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Listing> listings = new HashSet<>();
}