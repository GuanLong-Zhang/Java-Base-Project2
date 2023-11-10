package AbstractClassInterface1;

public class PingPangSport extends SportMan implements LearnEnglish{

    public PingPangSport(){
        System.out.println("PingPangSport无参构造");
    }

    public PingPangSport(String name,int age){
        super(name,age);
        System.out.println("PingPangSport有参构造");

    }

    @Override
    public void eat() {
        System.out.println("吃乒乓运动员餐");
    }

    @Override
    public void learn() {
        System.out.println("学习乒乓");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }

}
