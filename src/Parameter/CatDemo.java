package Parameter;

public class CatDemo {
    public static void main(String[] args){
        Cat c = new Cat();
        CatOperator ca = new CatOperator();
        ca.UseCat(c);           //类名作为形参     本质是对象作为形参

        Cat c1 = ca.GetCat();   //类名作为返回值   本质是对象作为返回值
        c1.eat();
    }
}
