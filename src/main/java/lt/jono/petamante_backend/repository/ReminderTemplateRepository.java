package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.ReminderTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderTemplateRepository extends JpaRepository<ReminderTemplate, Long> {
}
