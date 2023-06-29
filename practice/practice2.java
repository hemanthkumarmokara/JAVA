 /**
  * practice2
  */
 public class practice2 {
    Node root;

    class Node {
        Node llink;
        Node rlink;
        int data;
    Node(data){
        llink = null;
        rlink = null;
        this.data=data;
        }
    }
    void bstt(){
        Node first = new Node()
    }
    void insety(data1){
        Node newNode = new Node(data1);

        if(root == null){
            root = newNode;
        }
        Node ptr1 = root;
        Node ptr2 = null;

        while(ptr1 != null){
            ptr2 = ptr1;
            if (data1 < root.data){
                ptr1 = ptr1.llink;
                if(ptr1 == null){
                    ptr2.llink = newNode;
                }
            }
            else {
                
            }
        }
    }


    public static void main(String[] args) {
        
    }
    
 }