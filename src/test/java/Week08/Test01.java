package Week08;

public class Test01 {
    public static void main(String[] args) {
        Animal[] arr = new Animal[]{
            new Cat("哆啦a梦"),
            new Dog("旺财"),
            new Cat("哆啦b梦")
    };
        for (int i = 0; i < arr.length; i++) {
            arr[i].sound();
        }
        Animal d1 = new Dog("旺财");
        d1.sound();
        Animal c1 = new Cat("哆啦c梦");
        c1.sound();
    }
}
