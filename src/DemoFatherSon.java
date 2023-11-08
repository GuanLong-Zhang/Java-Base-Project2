public class DemoFatherSon {
    public static void main(String[] args){
        Father f = new Father();
        f.show();

        Son s = new Son();
        s.method();    //继承中变量的优先级：子类成员方法的优先级>子类成员>父类成员
        s.show();      //Son继承了Father,所以可以调用Father中的内容
    }
}
