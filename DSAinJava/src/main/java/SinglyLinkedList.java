
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
    public static void main(String[] args) {
       SinglyLinkedList list= new SinglyLinkedList();
       list.head= new listnode(10);
       listnode second=new listnode(20);
       listnode third =new listnode(30);
       listnode fourth =new listnode(40);
       
       //Now we will connect them together to form a chain
       list.head.next=second;
       second.next=third;
       third.next=fourth;
    
    }
    
}
