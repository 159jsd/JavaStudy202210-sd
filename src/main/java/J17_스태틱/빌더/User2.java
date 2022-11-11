package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    public User to() { //User2값으로 User값을 만드는 방법
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
