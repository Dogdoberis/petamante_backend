package lt.jono.petamante_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRelationDto {

    private Long fromUserId;

    private Long toUserId;

    private String relationType;

    private boolean active;

    // TODO: add fields to match UserRelation entity (timestamps, etc.)
}
