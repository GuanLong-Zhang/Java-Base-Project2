package InterfaceDemo;

public class Cat implements jumping{
    @Override
    public void jump(){   //抽象方法重写
        System.out.println("猫跳高");
    }

    public Cat(){
        super();
    }

}
