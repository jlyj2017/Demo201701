 
/**
 * 父类
 *
 */
public class Pet {
private	String names;
private	int healths;
private	int  intimacys;
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getHealths() {
		return healths;
	}
	public void setHealths(int healths) {
		this.healths = healths;
	}
	public int getIntimacys() {
		return intimacys;
	}
	public void setIntimacys(int intimacys) {
	this.intimacys = intimacys;
	}

	public void print(){
	System.out.println("我的名字叫"+names+"，我的健康值是"+healths+"，我和主人的亲密程度是"+intimacys);
	}
}
