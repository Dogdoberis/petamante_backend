 package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {
}
