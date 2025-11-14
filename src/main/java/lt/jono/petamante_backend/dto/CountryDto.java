package lt.jono.petamante_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryDto {

    private Long id;

    private String name;

    private String code; // e.g. "LT", "LV"

    // TODO: add fields to match Country entity
}
