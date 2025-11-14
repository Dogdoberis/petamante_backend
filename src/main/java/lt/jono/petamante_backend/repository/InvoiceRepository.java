package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
