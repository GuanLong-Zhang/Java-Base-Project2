package Parameter2;

public class JumpingOperator{
    public void UseJumping(Jumping j){
        j.jump();
    }

    public Jumping getJumping(){
        Jumping j = new Cat();    //接口引用指向子类对象
        return j;
    }
}
