 
/**
 * ����
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
	System.out.println("�ҵ����ֽ�"+names+"���ҵĽ���ֵ��"+healths+"���Һ����˵����̶ܳ���"+intimacys);
	}
}
