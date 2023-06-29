package interfaces;

// interface used to achieve multiple inheritance

// there involve 2 keywords here interface and implements
// here we do method declaration instead of method definition in intefaces

interface A {
    void aDisplay();
}
interface B {
	void bDisplay();
}

class ABC implements A,B{
    public void aDisplay(){
        System.out.println("interface A");
    }
    public void bDisplay(){
        System.out.println("interface B");
       
}
}
class Interface1{
    public static void main(String[] args){
        ABC obj = new ABC();
        obj.aDisplay();
        obj.bDisplay();

    }
}
