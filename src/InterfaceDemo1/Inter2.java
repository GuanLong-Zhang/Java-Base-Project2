package InterfaceDemo1;

//接口和接口的关系： 单继承和多继承
public interface Inter2 extends Inter0, Inter1{
    @Override
    void inter0();

    @Override
    void inter1();

    public abstract void inter2();
}
