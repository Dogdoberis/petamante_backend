package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetOwnershipHistoryDto {

    private Long id;

    private Long petId;

    private Long ownerId;

    private LocalDate fromDate;

    private LocalDate toDate;

    // TODO: add fields to match PetOwnershipHistory entity
}
