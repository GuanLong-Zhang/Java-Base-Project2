package Parameter2;

public class JumpingDemo {
    public static void main(String[] args) {
        Jumping j = new Cat();    //接口引用指向子类对象   接口多态
        JumpingOperator ju = new JumpingOperator();
        ju.UseJumping(j);         //接口名作为形参   本质上就是接口的实现子类对象作为形参

        Jumping j1 = ju.getJumping();    //接口名作为返回值   本质上是接口的实现子类作为返回值
        j1.jump();
    }
}
