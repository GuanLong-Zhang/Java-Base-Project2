package InterfaceDemo1;

//类和接口的关系：可以单实现，也可以多实现
public class InterDemo extends Demo implements Inter0, Inter1, Inter2{     //多实现+单继承

    @Override
    public void inter0() {
        System.out.println("inter0");
    }

    @Override
    public void inter1() {
        System.out.println("inter1");
    }

    @Override
    public void inter2() {
        System.out.println("inter2");
    }

}
