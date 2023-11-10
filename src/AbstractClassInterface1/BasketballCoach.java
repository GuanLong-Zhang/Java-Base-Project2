package AbstractClassInterface1;

public class BasketballCoach extends CoachMan{

    public BasketballCoach(){
        System.out.println("BasketballCoach无参构造");
    }

    public BasketballCoach(String name,int age){
        super(name,age);
        System.out.println("BasketballCoach有参构造");

    }

    @Override
    public void eat() {
        System.out.println("吃篮球教练餐");
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }
}
