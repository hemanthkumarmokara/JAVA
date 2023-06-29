public class arrays1Dm {
    
    public void printArray(int[] arrr){
        int nn = arrr.length;
        for (int i=0;i<nn;i++){
            System.out.print(arrr[i] + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        arrays1D nr = new arrays1D();
        nr.printArray( new int[] {25,67,2,3,12,1});
        
}
}