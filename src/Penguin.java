import java.util.Scanner;


/**
 * �����
 *
 */
public class Penguin extends Pet {    //�̳��� 
private	String sex;   //��װ���� 
public void  Penguin(){  //�޲ι��캯��
	Scanner input=new Scanner(System.in);
	System.out.println("���������������֣�");
	super.setNames(input.next());
	System.out.println("�����������Ľ���ֵ��");
	super.setHealths(input.nextInt());
	System.out.println("���������������ܶȣ�");
	super.setIntimacys(input.nextInt());
	System.out.println("�����������Ա�");
	sex=input.next();
	
}

	public void print(){   //�������
		System.out.println("�ҵ����ֽ�"+super.getNames()+"���ҵĽ���ֵ��"+super.getHealths()+"���Һ����˵����̶ܳ���"+super.getIntimacys()+"�ҵ��Ա���"+sex);
	}

}
