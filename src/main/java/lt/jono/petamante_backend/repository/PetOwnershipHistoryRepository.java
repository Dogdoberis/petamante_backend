package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.PetOwnershipHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetOwnershipHistoryRepository extends JpaRepository<PetOwnershipHistory, Long> {
}
