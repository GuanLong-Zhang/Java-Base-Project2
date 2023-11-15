package InterClass1;

public class JumpingDemo {
    public static void main(String[] args){
        JumpingOperator j = new JumpingOperator();   //创建操作类对象
        j.UseJump(new Jumping(){     //匿名对象    使用匿名对象就省去了每次创建实现子类对象的操作
            @Override
            public void jump() {     //重写抽象方法
                System.out.println("猫可以跳高");
            }
        });
    }


}
