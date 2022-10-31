package j10_접근지정자;

public class AcessModifierMain {
    public static void main(String[] args) {
        StudentAccessModifier mod = new StudentAccessModifier(20220101, "김준일");

        mod.showInfo();
        mod.setName("김준이");
        mod.showInfo();

        int code = mod.getCode();
        String name = mod.getName();
        System.out.println(name+code);
    }
}
