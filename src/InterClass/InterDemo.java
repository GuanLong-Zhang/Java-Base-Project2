package InterClass;

public class InterDemo {
    public static void main(String[] args){
//        Outer.Inter oi = new Outer().new Inter();   //创建成员内部类对象   只有属性是public时才可以这样使用
//        oi.intershow();

        Outer o = new Outer();          //创建外部类对象
        o.outershow();
    }
}
