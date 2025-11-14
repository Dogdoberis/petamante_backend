package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
