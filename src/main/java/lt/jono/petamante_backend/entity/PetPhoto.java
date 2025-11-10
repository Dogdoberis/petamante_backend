package lt.jono.petamante_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "pet_photos")
@Getter
@Setter
@NoArgsConstructor
public class PetPhoto {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false) private Pet pet;
    @Column(name = "photo_url", nullable = false) private String photoUrl;
    private String description;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;
}