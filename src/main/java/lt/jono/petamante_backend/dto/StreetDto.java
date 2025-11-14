package lt.jono.petamante_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StreetDto {

    private Long id;

    private String name;

    private Long cityId;

    // TODO: add fields to match Street entity
}
