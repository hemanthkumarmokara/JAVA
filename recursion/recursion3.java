public class recursion3 {
    public static void main(String[] args) {
        fun(8);
    }
    static void fun(int p){
        if(p==-1){
            return;
        }
        System.out.println(p);
        fun(p-1);
    }
    
}
