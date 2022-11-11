package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag) { //<?>는 안에 어떤 클래스가 들어올지 모른다는뜻. (여기선Tiger,Human둘 중 하나.)
        //<> 안에 extends Animal 이 들어있으면 Animal클래스를 상속 받은 클래스만 들어올수 있음. 따라서 Car는 안된다.
        //<> 안에 Person안에 Worker 와 Student - HightStudent로 나뉘어 졌다고 하자 이럴때 extends Student를 하면 Student,HightStudent만
        // 들어올수 있다 Person은 들어올수 없단 뜻이지만, super Student를 하면 Person과 Student까지만, super Worker를 하면 Person과 Worker까지만
        // 들어올 수 있다.
        if (flag ==1) {
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }
        else if (flag ==2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }
//        else if (flag ==3) {
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("K8"));
//            return animalData;
//        }
        return null;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getAnimal(1).printData();

    }
}
