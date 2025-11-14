package lt.jono.petamante_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto {

    private Long id;

    private String name;

    private String description;

    // TODO: add fields to match Role entity
}
