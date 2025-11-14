package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.UnavailableSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnavailableSlotRepository extends JpaRepository<UnavailableSlot, Long> {
}
