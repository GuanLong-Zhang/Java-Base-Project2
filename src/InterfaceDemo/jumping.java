package InterfaceDemo;

public interface jumping {
    public abstract void jump();    //抽象方法   没有方法实现

    public String name = "小红";     //成员变量
    public final int age = 18;      //final修饰，值不可以进行改变 常量

//    public jumping(){}            //报错，接口中没有构造方法
//    public void show(){}          //报错，接口中没有非抽象方法


}
