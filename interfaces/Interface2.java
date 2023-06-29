package interfaces;

interface features1{
	void dialing();
	void messaging();
}
interface features2{
	void vCalling();
	void sMedia();
}
class FeaturedPhone implements features1{
	public void dialing() {
		System.out.println("u r allowed to make general call from featured phone");
	}
	public void messaging() {
		System.out.println("u r allowed to make text messages from featured phone");
	}
}
class SmartPhone implements features1,features2{
	public void dialing() {
		System.out.println("u r allowed to make general call from featured phone");
	}
	public void messaging() {
		System.out.println("u r allowed to make text messages from featured phone");
	}
	public void vCalling() {
		System.out.println("u r allowed to make video call from smart phone");
	}
	public void sMedia() {
		System.out.println("u r allowed to use social meadia from smart phone");
	}
	
}


public class Interface2 {
	public static void main(String[] args) {
		 SmartPhone obj= new SmartPhone();
		 obj.dialing();
		 obj.messaging();
		 obj.vCalling();
		 obj.sMedia();
		 System.out.println(); 
		 FeaturedPhone obj1= new FeaturedPhone();
		 obj1.dialing();
		 obj1.messaging();
		 
	}

}
