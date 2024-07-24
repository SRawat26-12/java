class Node
{
int data;
Node next;
public Node(int data)
{
this.data=data;
this.next=null;
}
public Node addAtStart(Node head,int d)
{
Node newNode=new Node(d);
newNode.next=head;
head=newNode;
return head;

}
public void printData(Node head)
{
if(head==null)
{
System.out.println("List is empty");
}
else{
Node temp=head;
System.out.println("Data of singly linked list");
while(temp!=null)
{
System.out.print("===>"+temp.data);
temp=temp.next;
}
}
}
public static void main(String []args)
{
Node first=new Node(10);
Node second=new Node(20);
Node third=new Node(30);
Node head=first;
head.next=second;
head.next.next=third;
head.printData(head);
head=head.addAtStart(head,5);
System.out.println("Data after insert new node At start");
head.printData(head);
}
}