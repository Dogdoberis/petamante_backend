package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.PaymentReminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentReminderRepository extends JpaRepository<PaymentReminder, Long> {
}
