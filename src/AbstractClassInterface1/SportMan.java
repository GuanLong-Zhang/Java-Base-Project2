package AbstractClassInterface1;

public abstract class SportMan extends Person{

    public SportMan(){
        System.out.println("SportMan无参构造");
    }

    public SportMan(String name,int age){
        super(name,age);
        System.out.println("SportMan有参构造");
    }

    public abstract void learn();
}
