package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListingDto {

    private Long id;

    private Long userId;

    private Long petId;

    private String title;

    private String description;

    private boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // TODO: add fields to match Listing entity (price, location, etc.)
}
