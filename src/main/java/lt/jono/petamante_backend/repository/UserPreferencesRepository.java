package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.UserPreferences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPreferencesRepository extends JpaRepository<UserPreferences, Long> {
}
