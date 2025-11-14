package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
