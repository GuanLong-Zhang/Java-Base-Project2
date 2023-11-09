package AbstractClass;

public abstract class Animal {      //抽象类      类中包含抽象方法那么该类必须是抽象类  利用abstract进行修饰
    private int age = 20;
    private final String name = "小王";   //final修饰基本数据类型，基本数据类型的值不可以被修改

    public Animal(){
        System.out.println("Animal无参构造方法被调用");
    }

    public Animal(int age){
        System.out.println("Animal有参构造方法被调用");
        this.age = age;
    }

    public abstract void eat();     //抽象方法    没有方法体的方法称为抽象方法

    public void sleep(){            //成员方法  非抽象方法
        age = 30;
        System.out.println("age:" + age);
//        name = "小红";             //报错，final修饰的数据类型不可以被修改
        System.out.println("name:" + name);
        System.out.println("睡觉");
    }

}
