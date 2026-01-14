class DoublyLL {
    Node head;
    Node tail;
    int size;
    
    DoublyLL(){
        size=0;
    }
    
    class Node{
        int data;
        Node prev;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    
    //add-first
    public void addFirst(int data){
        Node newNode= new Node(data);
        size ++ ;
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    
    //add-last
    public void addLast(int data){
        Node newNode=new Node (data);
        size ++;

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    
    //delete-first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size --;
        
        if(head.next == null){
            head=null;
            tail=null;
            return;
        }
        Node temp=head;
        head=head.next;
        head.prev=null;
        temp.next=null; //Automatic Garbage Collection, no need of delete keyword
        
    }
    
    //delete-last
    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size --;
        if (head.next == null){
            head=null;
            tail=null;
            return;
        }
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;//Automatic Garbage Collection, no need of delete keyword
    }
    
    
    //print-list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    
    public static void main (String[] args){
        DoublyLL list=new DoublyLL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
    }
}