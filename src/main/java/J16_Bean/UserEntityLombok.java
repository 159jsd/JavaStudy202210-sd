package J16_Bean;


import lombok.*;

import java.util.Objects;

// 정보를 담는 객체를 Entity Class라 한다.

/*
*  멤버변수 선언
*  생성자 정의
*  Getters and Setters 정의
*  Equals and Hashcode 정의
*  toString 정의
* */

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data //위 주석처리 된 4개가 안에 들어간다.

public class UserEntityLombok {

    private String username;
    private String password;
    private String email;
    private String name;

}
