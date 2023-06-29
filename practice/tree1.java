class tree1{
    class Node{
         Node Rlink;
         Node Llink;
         int info;
         Node(int item){
            info=item;
            Rlink=null;
            Llink=null;
         }
    }

    Node root=null;
    void insert(int item){
        Node newnode=new Node(item);
        Node ptr1=root;
        Node ptr2=null;
        if(root==null){
            root=newnode;
        }
        while(ptr1!=null){
            ptr2=ptr1;
            if(ptr1.info>item){
                    ptr1=ptr1.Llink;
                    if(ptr1==null){
                        ptr2.Llink=newnode;
                    }
                }
                else{
                    ptr1=ptr1.Rlink;
                    if(ptr1==null){
                        ptr2.Rlink=newnode;
                    }
                }
            }
          }      
          void search(int item){
            Node ptr;
            ptr=root;
            while(ptr.info!=item){
                 if(ptr.info>item){
                ptr=ptr.Llink;
                if(ptr.info==item){
                    System.out.println("YEs the Element is present");
                }
            }
            else{
                ptr=ptr.Rlink;
                if(ptr.info==item){
                    System.out.println("YEs the element is present");
                }
            }
            }
           
          }      
          public static void main(String[]args){
            tree1 n=new tree1();
            n.insert(20);
            n.insert(15);
            n.insert(25);
            n.insert(10);
            n.insert(14);
            n.insert(5);
            n.search(10);
          }
        }

            
            
            

