package AbstractClass;

public class AnimalDemo {
    public static void main(String[] args){
        Animal an = new Cat();   //父类引用指向子类对象
        an.eat();
        an.sleep();
    }

}
