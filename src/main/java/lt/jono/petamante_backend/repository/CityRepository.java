package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
