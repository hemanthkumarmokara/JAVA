//package javaa.practice.assignments;

public class lab5 {
    Node head;
   static class Node {
        int data;
        Node next;
    
     Node(int data){
         this.data = data;
         this.next = null;
     }}
     // displaying the data
     void display(){
        Node cu = head;
        while (cu.next != null) {
            System.out.print(cu.data + " --> ");
            cu = cu.next;
        }System.out.println("null");
     }
     public Node Finsert(){
        Node newNode1;
        newNode1.next =head;
        head = newNode1;
     }
     public static void main(String[] args) {
        lab5 df = new lab5();
        df.head = new Node (23);
        Node second = new Node(34);
        Node third = new Node(45) ;
        Node fourth = new Node (56);
        Node fifth = new Node(67);
        df.head.next = second;
        second.next= third;
        third.next = fourth;
        fourth.next = fifth;
        df.display();
     }
    
}
