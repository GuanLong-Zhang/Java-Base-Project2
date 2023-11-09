package Animal;

import java.util.Scanner;
public class DemoCatDog {
    public static void main(String[] args){
        System.out.println("猫：");
        testCat();
        System.out.println("------------------");
        System.out.println("狗：");
        testDog();
        System.out.println("------------------");

    }

    public static void testCat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name = sc.nextLine();
        System.out.print("请输入年龄:");
        int age = sc.nextInt();
        Cat c = new Cat(name,age);
        c.printAnimal();
        c.printTesk();
    }

    public static void testDog(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name = sc.nextLine();
        System.out.print("请输入年龄:");
        int age = sc.nextInt();
        Dog d = new Dog(name,age);
        d.printAnimal();
        d.printTesk();
    }
}
