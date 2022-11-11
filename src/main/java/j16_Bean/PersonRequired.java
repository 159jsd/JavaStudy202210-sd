package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //private final String name 생성자가 만들어진 것. age는 final이 아니라 생성안됨.
@AllArgsConstructor

public class PersonRequired {
    private final String name;
    private int age;

}
