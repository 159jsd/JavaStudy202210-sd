package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;

        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();
        System.out.println();

        System.out.println("[캐스팅]");
        animal1 = human;
        animal2 = tiger;
        System.out.println("<업캐스팅>");
        // abssract 클래스 Animal이 상위클래스 이고 Human,Tiger 클래스가 Animal 클래스를 상속 받았으니
        // Animal 자료형에 human,tiger 객체를 업캐스팅할 수 있다.
        animal1.move();
        animal2.move();
        // Animal 클래스에 있는 명렁어는 똑같이 사용할 수 있으나 readBooks();나, hunting();은 사용 불가능하다.

        System.out.println("<다운캐스팅>");
        Human d_human = (Human) animal1;
        //Human클래스 객체 d_human에 Animal클래스를 넣으려면 Animal이 더 상위클래스기 때문에 앞에 (Human)생략 불가.
        Tiger d_tiger = (Tiger) animal2;
        d_human.readBooks();
        d_tiger.hunting();
        System.out.println("-------------------");
        System.out.println();

//        Animal a = new Animal();
//        Human h = (Human) a;
        //이 경우 Animal 에는 Move밖에 없지만 Human에는 readBooks도 필요하기 때문에 캐스팅이 불가능하다.
        //위쪽의 경우 Animal animal1 에 Animal과Human이 같이 생성된 human객체를 넣었기 때문에 잠시 Human메모리가
        //비활성화 됐다가 다시 다운캐스팅 할때 살아나서 d_human에 animal1을 넣을 수 있었다.



    }
}
