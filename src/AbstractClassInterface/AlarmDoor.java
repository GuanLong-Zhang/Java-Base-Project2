package AbstractClassInterface;

public class AlarmDoor extends AbDoor implements Interdoor{
    @Override
    public void open(){    //抽象方法重写   （抽象类）
        System.out.println("开门");
    }

    @Override
    public void close() {   //抽象方法重写
        System.out.println("关门");
    }

    @Override
    public void alarm() {   //抽象方法重写    （接口）
        System.out.println("报警");
    }
}
