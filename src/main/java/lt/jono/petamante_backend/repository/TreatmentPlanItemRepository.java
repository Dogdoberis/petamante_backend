package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.TreatmentPlanItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentPlanItemRepository extends JpaRepository<TreatmentPlanItem, Long> {
}
