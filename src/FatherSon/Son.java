package FatherSon;

//继承
public class Son extends Father {
    public int age = 20;
    public void method(){
        int age = 30;
        System.out.println("Son age:" + age);         //子类成员方法中的age
        System.out.println("Son age:" + this.age);    //访问子类的成员变量 用this
        System.out.println("Son age:" + super.age);   //访问父类的成员变量 用super
        System.out.println("Son method被调用");
    }

    public Son(){
//        super(20);   //用来解决父类中没有无参构造方法的情况，显示调用有参构造
        System.out.println("Son无参构造方法");
    }

    public Son(int a){
//        super(20);        //访问父类中的成员方法
        System.out.println("Son有参构造方法");


    }

    //方法重写，子类中出现了和父类中一模一样的方法声明
    @Override
    public void show(){
        super.show();      //访问父类中的成员方法
        System.out.println("Son show被调用");

    }

}
