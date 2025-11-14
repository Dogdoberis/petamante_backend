package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.WorkingHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingHoursRepository extends JpaRepository<WorkingHours, Long> {
}
