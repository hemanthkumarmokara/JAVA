import java.util.Scanner;
class lab5{ 
    class Node{  
        int data;  
        Node link=null;  
        Node(int data){
            this.data=data;
        }
        Node(){

        }
    }   
    Node start = null;
    int g=0;  
       
    public void linsert(int data) {    
        Node newNode = new Node(data);  
        if(start == null) {  
            start = newNode;  
        }
        else {
            Node ptr=start;
            while(ptr.link!=null){
                ptr=ptr.link;
            }
            ptr.link=newNode;
            
        }
        g++;  
    }  

    public void insert(int data,int pos){
        Node newNode= new Node(data);
        int n=1;
        Node ptr=start;
        if(start==null){
            start=newNode;
        }
        while(n<pos-1){
            ptr=ptr.link;
            n++;
        }
        newNode.link=ptr.link;
        ptr.link=newNode;
        g++;

    }

    public void finsert(int data){
        Node newNode=new Node(data);
        newNode.link=start;
        start=newNode;
        g++;
    }

    public void minsert(int data){
        Node newNode=new Node(data);
        int pd;
        if(g%2==0){
            pd=((g+1)/2)+1;
            insert(data,pd);
            
        }
        else{
            System.out.println("add one more element");
           
        }
    }

    public void fdelete(){
        Node newNode=new Node();
        if(start==null){
            System.out.println("underflow");
        }
        else{
            start=start.link;
        }
        g--;

    }

    public void ldelete(){
        Node newNode=new Node();
        Node ptr1,ptr2;
        ptr1=null;
        ptr2=start;
        while(ptr2.link!=null){
            ptr1=ptr2;
            ptr2=ptr2.link;
        }
        ptr1.link=null;
        g--;
    }

    public void posdelete(int pos){
        Node newNode=new Node();
        int n=1;
        Node ptr1=null;
        Node ptr2=start;
        if(start==null){
            System.out.println("underflow");
        }
        else if(ptr2.link==null){
            start=null;
        }
        else{
            while(n<=pos-1){
                ptr1=ptr2;
                ptr2=ptr2.link;
                n++;
            }
            ptr1.link=ptr2.link;
            ptr2.link=null;
        }
        g--;
    }

    public void mdelete(){
        Node newNode=new Node();
        if(g%2==0){
            System.out.println("cannot delete middle elements because there are even number of elements");
        }
        else{
            Node ptr1=null;
            Node ptr2=start;
            int dp;
            dp=(g+1)/2;
            posdelete(dp);
        }
    }

    public void search(int data){
        Node newNode=new Node(data);
        Node ptr=start;
        Boolean check=true; 
        while(ptr.link!=null){
            if(ptr.data==data){
                check=true;
                break;
            }
            else{
                check=false;
            }
            ptr=ptr.link;
        }
        if(check==true){
            System.out.println("given element is present in the list");
        }
        else{
            System.out.println("given element is not present in the list");
        }
    }

    void sort(){
        Node ptr111=null;
        Node ptr12=start;
        int temp=0;
       
           while(ptr12.link!=null){
          ptr111=ptr12;
          ptr12=ptr12.link;
          if(ptr12.data<ptr111.data){
            temp=ptr111.data;
            ptr111.data=ptr12.data;
            ptr12.data=temp;
        
         
          }
        }
      }


    public void display() { 
        Node ptr= start;  
        if(start == null) {  
            System.out.println("List has no elements in it");  
            return;  
        }  
        System.out.println("Nodes of singly linked list: ");  
        while(ptr != null) {  
            System.out.print(ptr.data + " ");  
            ptr = ptr.link;  
            
        }  
        System.out.println(); 
        System.out.println("the number of elements in the list are "+g); 
    }  
      
    public static void main(String[] args) {
        lab5 list = new lab5();
        list.linsert(54);
        list.linsert(87);
        list.linsert(32);
        list.linsert(92);
        list.linsert(43);
        Scanner y=new Scanner(System.in);
        System.out.println("choose a number from the following list");
        System.out.println("here 1 is to Display the elements in the linkedlist");
        System.out.println("here 2 is to insert an element at beginning");
        System.out.println("here 3 is to insert an element at the end");
        System.out.println("here 4 is to insert an element at the middle");
        System.out.println("here 5 is to delete an element from the beginning");
        System.out.println("here 6 is to delete an element from the end");
        System.out.println("here 7 is to delete an element from the middle");
        System.out.println("here 8 is to search an element in the linkedlist");
        System.out.println("here 9 is to sort the elements based on given data");
        
        while(true){
            int choice=y.nextInt();
        if(choice==0){
            break;
        }
        switch(choice){
            
            case 1:
            list.display();
            break;
            
            case 2:
            
            list.finsert(111);
            list.display();  
            break;

            case 3:
         
            list.linsert(222);
            list.display(); 
            break; 

            case 4:
            
            list.minsert(333);
            list.display();
            break;

            case 5:
            list.fdelete();
            list.display();
            break;

            case 6:
            list.ldelete();
            list.display();
            break;

            case 7:
            list.mdelete();
            list.display();
            break;

            case 8:
            
            list.search(32);
            break;

            case 9:
            for(int e=0;e<list.g;e++){
                list.sort();
            }
            list.display();
            break;

        }  
        }      
    }  
}
