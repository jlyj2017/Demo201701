import java.util.Scanner;


/**
 * 企鹅类
 *
 */
public class Penguin extends Pet {    //继承类 
private	String sex;   //封装属性 
public void  Penguin(){  //无参构造函数
	Scanner input=new Scanner(System.in);
	System.out.println("请输入你宠物的名字：");
	super.setNames(input.next());
	System.out.println("请输入你宠物的健康值：");
	super.setHealths(input.nextInt());
	System.out.println("请输入你宠物的亲密度：");
	super.setIntimacys(input.nextInt());
	System.out.println("请输入宠物的性别：");
	sex=input.next();
	
}

	public void print(){   //输出方法
		System.out.println("我的名字叫"+super.getNames()+"，我的健康值是"+super.getHealths()+"，我和主人的亲密程度是"+super.getIntimacys()+"我的性别是"+sex);
	}

}
