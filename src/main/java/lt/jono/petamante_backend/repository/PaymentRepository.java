package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
