package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lt.jono.petamante_backend.entity.enums.UserType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserData {

    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type", nullable = false)
    private UserType userType;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String companyName;

    @Column
    private String companyCode;

    @Column
    private String vatNumber;

    @Column
    private String address;


    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "postal_code")
    private String postalCode;

    @Column
    private String phone;

    @Column
    private LocalDate birthDate;

    @Column(name = "parent_legal_id")
    private Long parentLegalId;

    @Column(name = "services_description")
    private String servicesDescription;

    @Column(name = "business_info")
    private String businessInfo;

    @Column(name = "website_url")
    private String websiteUrl;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column
    private LocalDateTime updatedAt = LocalDateTime.now();
}