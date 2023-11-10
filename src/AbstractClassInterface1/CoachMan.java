package AbstractClassInterface1;

public abstract class CoachMan extends Person{

    public CoachMan(){
        System.out.println("CoachMan无参构造");
    }

    public CoachMan(String name,int age){
        super(name,age);
        System.out.println("CoachMan有参构造");

    }
    public abstract void teach();
}
