package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.RecommendationCategory;
import lt.jono.petamante_backend.entity.enums.Species;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendationTemplateDto {

    private Long id;

    private String title;

    private RecommendationCategory category;

    private Species species;

    private String breed;

    private Integer ageFromMonths;

    private Integer ageToMonths;

    private String content;

    private boolean active;

    private Long createdById;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
