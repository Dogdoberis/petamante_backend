package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.RecommendationTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationTemplateRepository extends JpaRepository<RecommendationTemplate, Long> {
}
