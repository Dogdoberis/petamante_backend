package lt.jono.petamante_backend.repository;

import lt.jono.petamante_backend.entity.UserRelation;
import lt.jono.petamante_backend.entity.UserRelationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRelationRepository extends JpaRepository<UserRelation, UserRelationId> {
}
