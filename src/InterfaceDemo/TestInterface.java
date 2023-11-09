package InterfaceDemo;

public class TestInterface {
    public static void main(String[] args){
        jumping j = new Cat();   //接口引用指向子类对象
        j.jump();
//        j.name = "小张";        //报错，接口中的成员变量默认被final修饰，即不可以被修改
        System.out.println(j.name);
//        System.out.println(jumping.name);   //接口中的成员变量默认还被Static修饰，即可以通过接口名进行访问成员变量
//        j.age = 40;            //报错，final修饰的变量不可以被修改
        System.out.println(j.age);

    }

}
