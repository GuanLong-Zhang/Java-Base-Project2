package Parameter1;

public class AnimalOperator {
    public void UseEat(Animal a){     //抽象类名作为形参    本质是抽象类的子类对象作为形参
        a.eat();
    }

    public Animal get(){              //抽象类名作为返回值   本质是抽象类的子类对象作为返回值
        Animal an = new Cat();
        return an;
    }
}
