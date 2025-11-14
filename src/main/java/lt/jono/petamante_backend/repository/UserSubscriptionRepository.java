package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Long> {
}
