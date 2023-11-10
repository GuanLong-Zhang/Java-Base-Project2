package AbstractClassInterface1;

public class PingPangCoach extends CoachMan implements LearnEnglish{

    public PingPangCoach(){
        System.out.println("PingPangCoach无参构造");
    }

    public PingPangCoach(String name,int age){
        super(name,age);
        System.out.println("PingPangCoach有参构造");

    }

    @Override
    public void eat() {
        System.out.println("吃乒乓教练餐");
    }

    @Override
    public void teach() {
        System.out.println("教乒乓");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }
}
