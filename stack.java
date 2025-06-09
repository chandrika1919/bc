//node class
class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
}
//stack class using linkedlist
class stack{
private node top;//top of the stack
public stack(){
this.top=null;
}
}
//push operation
public void push(int data){
Node newNode=newNode(data);
newNode.next=top;
top=newNode;
}
//pop operation
public int pop()
if(is empty()){
System.out.println("stack underflow !cannot pop from an empty stack.");
return-1; //or throw exception
}
int popped Data=top.data;
top=top.next
return popped Data
}
//peek operation
public int peek(){
if(isEmpty()){
System.out.println("stack isEmpty!");
return-1;//or throw exception
}
returntop.data;
}
//check if stack is empty
public boolean isEmpty(){
return top==null;
}
//Display stack elements
public void display(){
if(isEmpty()){
System.out.println("stack is empty");
return;
}
Node temp=top;
while(temp!=null){
System.out.println(temp.data+".>");
temp=temp.next;
}
System.out.println("none");
}
}
//usage
public class Main{
public static void main(String[] args){
stack stack=new stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack display();
System.out.println("popped:"+stack.pop());
stack.display();
}
}

