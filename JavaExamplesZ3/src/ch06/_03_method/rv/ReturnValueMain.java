package ch06._03_method.rv;

public class ReturnValueMain
{
  public static void main(String[] args)
  {
    ReturnValueDemo rvd = new ReturnValueDemo();
    System.out.println("0.--------�S���Ǧ^��---------------");
    rvd.returnValue0(); // ���涶�Ƿ|�����Ӥ�k�A���쥦�����~�|�^�즹�ԭz�~����楼������
    System.out.println("1.--------�Ǧ^�Ȭ��@�Ӿ��---------");
    int num = rvd.returnValue1();  // �P�W
    System.out.println("�üƬO" + num);
    System.out.println("2.--------�Ǧ^�Ȭ��@�Ӱ}�C---------");
    int[] arr = rvd.returnValue2();  // �P�W
    System.out.println("year=" + arr[0]);
    System.out.println("month=" + arr[1]);
    System.out.println("day=" + arr[2]);
    System.out.println("3.--------�Ǧ^�Ȭ��@�Ӫ���---------");
    Message msg = rvd.returnValue3();
    System.out.println("����msg�ݩʡG" + msg.msg);
    System.out.println("����code�ݩʡG" + msg.code);
    System.out.println("����now�ݩʡG"+msg.now);
  }
}
