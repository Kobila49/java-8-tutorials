package igor.kos.primitives_and_wrappers;

public class Executable {

    public static void main(String[] args) {

        boolean isWorking = false;
        System.out.println(isWorking);

        Person p = new Person();
        System.out.println(p.getAge());
        System.out.println(p.isMarried());

        p.setAge(30);
        System.out.println(p.getAge());
    }
}
