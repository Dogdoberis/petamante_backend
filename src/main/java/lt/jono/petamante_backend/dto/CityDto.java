package lt.jono.petamante_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityDto {

    private Long id;

    private String name;

    private Long countryId;

    // TODO: add fields to match City entity (e.g. postalCode, region, etc.)
}
