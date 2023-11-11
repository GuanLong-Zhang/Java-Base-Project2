package Parameter2;

public class Cat implements Jumping{     //子类实现接口   接口多态

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}
