public class DemoFatherSon {
    public static void main(String[] args){
        Father f = new Father(20);
        f.show();
        System.out.println("-----------------");

        Son s = new Son();
        s.method();    //继承中变量的优先级：子类成员方法的优先级>子类成员>父类成员
        s.show();      //Son继承了Father,所以可以调用Father中的内容，如果子类有该成员方法，就先访问子类的成员方法；如果没有，就访问父类的成员方法
        System.out.println("-----------------");

        Son s1 = new Son(20);   //子类中的构造方法默认访问父类的无参构造方法
        System.out.println("-----------------");


    }
}
