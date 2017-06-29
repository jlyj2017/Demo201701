
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*向上转型	*/
		Father f=new Son();
		f.print();
   /*向下转型*/
		Son g=(Son)f;
		g.prints();
	}

}
