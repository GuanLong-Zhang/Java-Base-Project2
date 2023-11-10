package AbstractClassInterface1;

public class BasketballSport extends SportMan{

    public BasketballSport(){
        System.out.println("BasketballSport无参构造");
    }

    public BasketballSport(String name,int age){
        super(name,age);
        System.out.println("BasketballSport有参构造");

    }

    @Override
    public void eat() {
        System.out.println("吃篮球运动员餐");
    }

    @Override
    public void learn() {
        System.out.println("学习篮球");
    }


}
