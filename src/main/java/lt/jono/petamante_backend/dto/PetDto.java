package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetDto {

    private Long id;

    private Long ownerId;

    private String name;

    private String species;

    private String breed;

    private LocalDate birthDate;

    private String sex;

    // TODO: add fields to match Pet entity (microchip, color, notes, etc.)
}
