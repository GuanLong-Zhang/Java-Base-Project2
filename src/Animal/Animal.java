package Animal;

public class Animal {
    private String name;
    private int age;

    public Animal(){
        System.out.println("Animal无参构造函数被调用");
    }

    public Animal(String name,int age){
        System.out.println("Animal有参构造函数被调用");
        this.name = name;
        this.age = age;
    }

    public void printAnimal(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }

}
