package Parameter1;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();      //抽象类的引用指向子类对象   抽象多态
        AnimalOperator an = new AnimalOperator();
        an.UseEat(a);              //抽象类名作为形参  本质是抽象类的子类对象作为形参

        Animal b = an.get();       //抽象类名作为返回值 本质是抽象类的子类对象作为返回值
        b.eat();
    }
}
