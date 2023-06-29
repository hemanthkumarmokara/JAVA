import java.util.*;
class ListNode
{
int data;
ListNode next;
ListNode(int d)
{
data = d;
next = null;
}
}
class BinaryTreeNode
{
int data;
BinaryTreeNode left, right = null;
BinaryTreeNode(int data)
{
this.data = data;
left = right = null;
}
}
class practice4
{
ListNode head;
BinaryTreeNode root;
void push(int new_data)
{
ListNode new_node = new ListNode(new_data);
new_node.next = head;
head = new_node;
}
BinaryTreeNode convertList2Binary(BinaryTreeNode node)
{
Queue<BinaryTreeNode> q =
new LinkedList<BinaryTreeNode>();
if (head == null)
{
node = null;
return null;
}
node = new BinaryTreeNode(head.data);
q.add(node);
head = head.next;
while (head != null)
{
BinaryTreeNode parent = q.peek();
BinaryTreeNode leftChild = null, rightChild = null;
leftChild = new BinaryTreeNode(head.data);
q.add(leftChild);
head = head.next;
if (head != null)
{
rightChild = new BinaryTreeNode(head.data);
q.add(rightChild);
head = head.next;
}
parent.left = leftChild;
parent.right = rightChild;
q.poll();
}
return node;
}
void postTraversal(BinaryTreeNode node)
{
if (node != null)
{
postTraversal(node.left);
postTraversal(node.right);
System.out.print(node.data + " ");
}
}
// Driver program to test above functions
public static void main(String[] args)
{
practice4 tree = new practice4();
tree.push(200);
tree.push(644);
tree.push(45);
tree.push(506);
tree.push(234);
tree.push(93); 
BinaryTreeNode node = tree.convertList2Binary(tree.root);
System.out.println("Postorder Traversal of the"+
" constructed Binary Tree is:");
tree.postTraversal(node);
}
}