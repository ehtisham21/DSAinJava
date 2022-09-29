public class DoublyLinkedList {
    doublinkedlist head;
    doublinkedlist tail;
    class doublinkedlist{
        int data;
         doublinkedlist previous;
         doublinkedlist next;

        public doublinkedlist(int data) {
            this.data=data;
        }
         
    }
    public DoublyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void insertfirst(int x){
        doublinkedlist y=new doublinkedlist(x);
        if(head==null){
            head=y;
        }
        else{
           head.next=y;
        }
    }
    public void display(){
        if(head==null){
            return;
        }
        doublinkedlist temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public doublinkedlist delete(){
        doublinkedlist temp=head;
        if(head==tail){
            tail=null;
            
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
    temp.next=null;
    return temp;
    
    }
    
    public static void main(String[] args) {
     DoublyLinkedList listt=new DoublyLinkedList();
     listt.insertfirst(10);
     listt.insertfirst(20);
     listt.insertfirst(30);
     listt.display();
     listt.delete();
    }
    
}
