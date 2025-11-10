package lt.jono.petamante_backend.entity;
import java.io.Serializable;
import java.util.Objects;

public class UserRelationId implements Serializable {

    private Long legalId;
    private Long privateId;

    // Būtini konstruktoriai
    public UserRelationId() {}

    public UserRelationId(Long legalId, Long privateId) {
        this.legalId = legalId;
        this.privateId = privateId;
    }

    // equals() ir hashCode() – BŪTINA!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRelationId)) return false;
        UserRelationId that = (UserRelationId) o;
        return Objects.equals(legalId, that.legalId) &&
                Objects.equals(privateId, that.privateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legalId, privateId);
    }
}