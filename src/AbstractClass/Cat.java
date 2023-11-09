package AbstractClass;

public class Cat extends Animal{    //继承
    @Override
    public void eat() {             //抽象方法重写
        System.out.println("猫吃鱼");
    }
}
