package InterClass;

public class Outer {    //外部类
    private String name = "小王";
    private int age = 10;

    public void outershow(){    //外部类要访问内部类成员必须创建对象
        System.out.println("name:" + name);
        Inter i = new Inter();
        i.intershow();
    }

//    public class Inter{          //内部类可以直接访问外部类成员    //成员内部类
//        public void intershow(){
//            System.out.println("age:" + age);
//        }
//    }

    private class Inter{          //内部类可以直接访问外部类成员    //成员内部类
        public void intershow(){
            System.out.println("age:" + age);
        }
    }


}
