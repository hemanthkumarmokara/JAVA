package overloading;

class M_overloading {

		
		void add() {
			int a=10,b=20;
			int c=a+b;
			System.out.println("sum="+c);
			}
		void add(int x,int y) {
			int z=x+y;
			System.out.println("summ="+z);
		}
}
class M_overloading2{
	public static void main(String args[]) {
		M_overloading obj1=new M_overloading();
		obj1.add();
		obj1.add(34, 66);
	}
}
// static methods can be overloaded
//static methods can't be overidden
