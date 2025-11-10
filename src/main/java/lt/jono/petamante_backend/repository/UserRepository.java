package lt.jono.petamante_backend.repository;
import lt.jono.petamante_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}