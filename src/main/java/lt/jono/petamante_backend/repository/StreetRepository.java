package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, Long> {
}
