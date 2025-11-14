package lt.jono.petamante_backend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;

    private String email;

    private String username;

    private boolean enabled;

    private LocalDateTime createdAt;

    private LocalDateTime lastLoginAt;

    // TODO: add fields to match User entity (roles, flags, etc.)
}
