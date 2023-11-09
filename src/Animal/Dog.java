package Animal;

public class Dog extends Animal {
    public Dog(){
        System.out.println("Dog的无参构造方法被调用");
    }

    public Dog(String name,int age){
        super(name,age);    //调用Animal中的有参构造
        System.out.println("Dog的有参构造方法被调用");
    }

    public void printTesk(){
        System.out.println("任务：看门");
    }

}
