
public class SinglyLinkedList {
    private  listnode head;
    private static class listnode{
        private int data;
         listnode next;

        public listnode(int data) {
            this.data=data;
            this.next=null;
            
        }
        
    }
    public void display(){
        listnode current = head;
        while (current!=null) {
            System.out.print(current.data + "-->");
            current=current.next;
        }
        System.out.println("Null");
    }
    //Insert Node at the beginning of Singly Linked List
    public void addfirst(int val){
        listnode test=new listnode(val);
        test.next=head;
        head=test;
    }
     //Insert Node at the end of Singly Linked List
    public void addlast(){
        listnode test1=new listnode(100);
        if (head==null) {
            head=test1;
        }
        listnode current= head;
        while(current.next!=null) {
            current=current.next;
        }
        current.next=test1;
    }
    public listnode deletefirst(){
        if(head==null){
        return null;   
        }
        listnode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public listnode deletelast(){
        if(head==null || head.next==null){
        return head;   
        }
        listnode current=head;
        listnode previous=head;
        while (current.next!=null) {
          previous=current;
          current=current.next;
        }
       previous.next=null;
       return current;
    }
    public static void main(String[] args) {
       SinglyLinkedList list= new SinglyLinkedList();
//       list.head= new listnode(10);
//       listnode second=new listnode(20);
//       listnode third =new listnode(30);
//       listnode fourth =new listnode(40);
//       listnode fifth=new listnode(50);
//       //Now we will connect them together to form a chain
//       list.head.next=second;
//       second.next=third;
//       third.next=fourth;
       
       list.addfirst(22);
       list.addfirst(21);
       list.addfirst(20);
       list.addlast();
       list.deletefirst();
       list.deletelast();
       list.display();
      
    }
    
}
