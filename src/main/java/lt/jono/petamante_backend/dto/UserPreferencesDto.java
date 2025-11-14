package lt.jono.petamante_backend.dto;

import lombok.*;
import lt.jono.petamante_backend.entity.enums.Theme;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPreferencesDto {

    private Long id;

    private Long userId;

    private Theme theme;

    private boolean emailNotificationsEnabled;

    private boolean smsNotificationsEnabled;

    // TODO: add fields to match UserPreferences entity
}
