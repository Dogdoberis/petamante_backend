package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.UserType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDataDto {

    private Long userId;

    private UserType userType;

    private String firstname;

    private String lastname;

    private String companyName;

    private String companyCode;

    private String vatNumber;

    private Long streetId;

    private String houseNumber;

    private String apartment;

    private Long countryId;

    private Long cityId;

    private String postalCode;

    private String phone;

    private LocalDate birthDate;

    private Long parentLegalId;

    private String servicesDescription;

    private String businessInfo;

    private String websiteUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
