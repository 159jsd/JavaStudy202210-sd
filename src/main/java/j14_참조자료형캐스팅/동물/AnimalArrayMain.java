package j14_참조자료형캐스팅.동물;

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal animals[] = new Animal[4];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) { //실재로 생성된 객체 = Instance
                ((Human) animals[i]).readBooks(); // ()를 붙히지 않으면 다운캐스팅이 먼저 일어나지 않는다.
            }
            else {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }
        }





    }
}
