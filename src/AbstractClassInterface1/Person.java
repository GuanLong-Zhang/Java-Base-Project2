package AbstractClassInterface1;

public abstract class Person {
    public String name;
    public int age;

    public Person(){
        System.out.println("Person无参构造");
    }

    public Person(String name,int age){
        System.out.println("Person有参构造");
        this.name = name;
        this.age = age;
    }

    public void printPerson(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    public abstract void eat();
}
