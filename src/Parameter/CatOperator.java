package Parameter;

public class CatOperator {
    public void UseCat(Cat c){   //类名作为形参   本质是对象作为形参
        c.eat();
    }

    public Cat GetCat(){
        Cat c = new Cat();
        return c;               //类名作为返回值   本质是对象作为返回值
    }
}
