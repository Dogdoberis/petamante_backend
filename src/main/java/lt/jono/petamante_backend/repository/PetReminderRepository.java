package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.PetReminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetReminderRepository extends JpaRepository<PetReminder, Long> {
}
