package constructorss;
// we can't define the constructors whether they are static or non static
public class Constructors2 {
	  public static int i;
    public double u;
	public Constructors2() {
		i=20;
		u=67.8;
	}
	 public Constructors2(double b) {
		u=b;
	}
	public Constructors2(int a) {
		i = a;		
	}
	public static void main(String[] args) {
		Constructors2 gh = new Constructors2();
		System.out.println(i);
		System.out.println(gh.u);
	}}
