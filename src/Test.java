
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*����ת��	*/
		Father f=new Son();
		f.print();
   /*����ת��*/
		Son g=(Son)f;
		g.prints();
	}

}
