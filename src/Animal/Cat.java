package Animal;

public class Cat extends Animal {
    public Cat(){
        System.out.println("Cat的无参构造方法被调用");
    }

    public Cat(String name,int age){
        super(name,age);    //调用Animal中的有参构造
        System.out.println("Cat的有参构造方法被调用");
    }

    public void printTesk(){
        System.out.println("任务：抓老鼠");
    }

}
