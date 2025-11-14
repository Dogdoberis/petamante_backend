package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.PetPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetPhotoRepository extends JpaRepository<PetPhoto, Long> {
}
