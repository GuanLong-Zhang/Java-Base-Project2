package Ploymorphic;

public class DemoAnimal {
    public static void main(String[] args){
        Animal an = new Cat();    //父类引用指向子类对象    向上转型

        System.out.println(an.age);
//        System.out.println(an.weight);    //报错了，无法访问子类中的成员变量
        an.eat();                           //输出的结果为，重写后的内容
//        an.playGame();                    //报错了，无法访问子类中的成员方法

        Cat c = (Cat)an;          //父类引用转为子类对象    向下转型   类似于强转   这样就可以使用子类中的特有方法和成员变量了
        System.out.println(c.weight);
        c.playGame();


    }
}
