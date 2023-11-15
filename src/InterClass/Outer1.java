package InterClass;

public class Outer1 {      //外部类
    private String name = "小王";
    private int age = 10;

    public void outer1show() {
        String name1 = "小张";
        System.out.println("name:" + name);

        class Inter1 {      //局部内部类   在成员方法内部
            public void inter1show() {
                System.out.println("age:" + age);    //可以访问外部类的成员，也可以访问方法内的局部变量
                System.out.println("name1:" + name1);
            }
        }
        Inter1 i = new Inter1();
        i.inter1show();
    }


}
