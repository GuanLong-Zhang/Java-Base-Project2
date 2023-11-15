package InterClass;

public class Outer2 {
    public void Outer2show(){
        Inter i = new Inter(){     //使用接口的引用去接收对象    匿名内部类  在成员方法内部
            @Override
            public void intershow(){     //方法重写
                System.out.println("匿名对象类");
            }
        };
        i.intershow();
        i.intershow();
    }

}
