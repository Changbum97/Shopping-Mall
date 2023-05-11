package study.sns.domain.dto.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import study.sns.domain.entity.Group;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupAddRequest {

    private String name;
    private String enterCode;

    public Group toEntity() {
        return Group.builder()
                .name(name)
                .enterCode(enterCode)
                .userGroups(new ArrayList<>())
                .build();
    }
}
