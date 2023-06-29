 
 public class practice3 {
    Node head;
    Node last;
    class Node{
        Node llink;
        Node rlink;
        int info;
        Node(int item){
            llink = null;
            rlink = null;
            info = item;
        }
    }
void Finsert(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        
    }
    else{
        newNode.rlink = head;
        head.llink = newNode;
        head = newNode;
        newNode.llink = null;
    }
}
void display(){
    Node ptr = head;
    while(ptr != null){
        System.out.print(ptr.info + "-->");
        ptr=ptr.rlink;
    }
    System.out.println("end");
}

void reverse(){
    Node ptr = head;
    while(ptr.rlink != null){
          ptr=ptr.rlink;
    }
    while(ptr != null){
        System.out.print(ptr.info +"-->");
        ptr=ptr.llink;
    }
    System.out.println("end");
}

    public static void main(String[] args) {
        practice3 nn = new practice3();
        nn.Finsert(34);
        nn.Finsert(94);
        nn.Finsert(44);
        nn.Finsert(54);
        nn.Finsert(64);
        nn.Finsert(74);
        nn.display();
        nn.reverse();        
    }
 
    
 }