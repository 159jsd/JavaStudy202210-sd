package J17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("user@example.com")
                .username("user")
                .build();

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("user2")
                .password("password")
                .build();

        System.out.println(user2);

        User user1 = user2.to();

        System.out.println(user1);
    }
}
