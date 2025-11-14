package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
