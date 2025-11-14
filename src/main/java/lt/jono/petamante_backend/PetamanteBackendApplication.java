package lt.jono.petamante_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "lt.jono.petamante_backend",
                "lt.jono.petamante_backend.entity",
                "lt.jono.petamante_backend.repository"
        }
)

public class PetamanteBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetamanteBackendApplication.class, args);
    }

}
