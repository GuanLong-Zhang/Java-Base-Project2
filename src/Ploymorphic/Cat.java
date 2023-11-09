package Ploymorphic;

public class Cat extends Animal {    //继承关系
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat(){               //方法重写   子类和父类有相同的成员方法声明
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉老鼠");
    }

}
