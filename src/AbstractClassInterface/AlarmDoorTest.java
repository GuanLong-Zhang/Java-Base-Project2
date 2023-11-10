package AbstractClassInterface;

public class AlarmDoorTest {
    public static void main(String[] args){
        AlarmDoor al = new AlarmDoor();
        al.open();    //抽象类
        al.close();
        al.alarm();   //接口
        System.out.println("-----------------------");
    }
}
