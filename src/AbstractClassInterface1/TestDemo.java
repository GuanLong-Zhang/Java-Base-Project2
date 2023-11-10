package AbstractClassInterface1;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args){
        System.out.println("篮球运动员");
        BasketballSport();
        System.out.println("------------------");
        System.out.println("篮球教练");
        BasketballCoach();
        System.out.println("------------------");
        System.out.println("乒乓运动员");
        PingPangSport();
        System.out.println("------------------");
        System.out.println("乒乓教练");
        PingPangCoach();
        System.out.println("------------------");
    }

    public static void BasketballSport(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        BasketballSport ba = new BasketballSport(name,age);
        ba.printPerson();
        ba.eat();
        ba.learn();
    }

    public static void BasketballCoach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        BasketballCoach ba = new BasketballCoach(name,age);
        ba.printPerson();
        ba.eat();
        ba.teach();
    }

    public static void PingPangSport(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        PingPangSport pi = new PingPangSport(name,age);
        pi.printPerson();
        pi.eat();
        pi.learn();
        pi.learnEnglish();
    }

    public static void PingPangCoach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        PingPangCoach pi = new PingPangCoach(name,age);
        pi.printPerson();
        pi.eat();
        pi.teach();
        pi.learnEnglish();
    }
}
