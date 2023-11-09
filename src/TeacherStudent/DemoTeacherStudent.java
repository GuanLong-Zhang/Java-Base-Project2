package TeacherStudent;

import java.util.Scanner;
public class DemoTeacherStudent {
    public static void main(String[] args){
        Teacher t = new Teacher();
        System.out.println("教师信息：");
        TestTeacher(t);
        System.out.println("-------------------");
        Student s = new Student();
        System.out.println("学生信息：");
        TestStudent(s);
        System.out.println("-------------------");

    }

    public static void TestTeacher(Teacher t){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name = sc.nextLine();
        System.out.print("请输入年龄:");
        int age = sc.nextInt();
        t.SetNameAge(name, age);
        t.PrintNameAge();
        t.PrintTesk();
    }

    public static void TestStudent(Student s){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name = sc.nextLine();
        System.out.print("请输入年龄:");
        int age = sc.nextInt();
        s.SetNameAge(name, age);
        s.PrintNameAge();
        s.PrintTesk();
    }
}
