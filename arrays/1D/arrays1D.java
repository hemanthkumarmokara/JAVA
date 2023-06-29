public class arrays1D {
    
    public void printArray(int[] arrr){
        int nn = arrr.length;
        for (int i=0;i<nn;i++){
            System.out.print(arrr[i] + " ");
        }
        System.out.println();
    }
    public void arryDemo(){
        int mAray[] = new int[5];
       
       mAray[0] = 11;
       mAray[1] = 12;
       mAray[2] = 13;
       mAray[3] = 14;
       mAray[4] = 15;
       mAray[0] = 132;
       mAray[3] = 131;

       printArray(mAray);
    }
    public static void main(String[] args) {
        arrays1D nr = new arrays1D();
        nr.arryDemo();
    }
}
