import java.util.Scanner;


/**
 * dog类
 *
 */
public class Dog  extends Pet {   //继承类 
private	String types;  //封装属性 
	public String getTypes() {
	return types;
}
public void setTypes(String types) {
	this.types = types;
}
public void Dog(){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入你宠物的名字：");
	super.setNames(input.next());
	System.out.println("请输入你宠物的健康值：");
	super.setHealths(input.nextInt());
	System.out.println("请输入你宠物的亲密度：");
	super.setIntimacys(input.nextInt());
	System.out.println("请输入宠物的类型：");
	types=input.next();
}

public void print(){
		System.out.println("我的名字叫"+super.getNames()+"，我的健康值是"+super.getHealths()+"，我和主人的亲密程度是"+super.getIntimacys()+"我是一只"+types);
	}
	}
	
	
	
	
	
	
