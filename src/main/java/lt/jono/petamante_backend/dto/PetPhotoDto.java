package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetPhotoDto {

    private Long id;

    private Long petId;

    private String url;

    private String description;

    private boolean primary;

    private LocalDateTime createdAt;

    // TODO: adjust fields to exactly match PetPhoto entity
}
