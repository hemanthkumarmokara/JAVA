public class Recursion2 {
    public static void main(String[] args) {

        System.out.println(fibo(6));
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        // this is not a tale recursion
        // because here fibo(n-1) is not the last statement that is to be executed
        // here { return fibo(n-1) + fibo(n-2);} this whole method will be executed
        return fibo(n-1) + fibo(n-2);
    }
    
    
} 
