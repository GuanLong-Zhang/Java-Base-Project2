package TeacherStudent;

public class Person {
    private String name;
    private int age;

    public void SetNameAge(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void PrintNameAge(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
