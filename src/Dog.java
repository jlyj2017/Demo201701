import java.util.Scanner;


/**
 * dog��
 *
 */
public class Dog  extends Pet {   //�̳��� 
private	String types;  //��װ���� 
	public String getTypes() {
	return types;
}
public void setTypes(String types) {
	this.types = types;
}
public void Dog(){
	Scanner input=new Scanner(System.in);
	System.out.println("���������������֣�");
	super.setNames(input.next());
	System.out.println("�����������Ľ���ֵ��");
	super.setHealths(input.nextInt());
	System.out.println("���������������ܶȣ�");
	super.setIntimacys(input.nextInt());
	System.out.println("�������������ͣ�");
	types=input.next();
}

public void print(){
		System.out.println("�ҵ����ֽ�"+super.getNames()+"���ҵĽ���ֵ��"+super.getHealths()+"���Һ����˵����̶ܳ���"+super.getIntimacys()+"����һֻ"+types);
	}
	}
	
	
	
	
	
	
