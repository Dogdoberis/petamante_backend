package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.TreatmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentPlanRepository extends JpaRepository<TreatmentPlan, Long> {
}
