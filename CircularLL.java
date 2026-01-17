class CircularLL {
    
    Node head;
    Node tail;
    int size;
    
    CircularLL(){
        size=0;
    }
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    //add-first
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        head=newNode;
        tail.next=newNode;
    }
    
    //add-last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        tail=newNode;
        
    }
    
    //print-LL
    public void printLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
        
    }

    //for printing LL
    //System.out.println(head.data+"->");
    //Node temp=head.next;
    //while(temp!=head){
    //    System.out.print(temp.data+"->");
    //    temp=temp.next;
    //}

    
    //delete-first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size --;
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node temp=head;
        head=head.next;
        tail.next=head;
        temp.next=null;
    }
    
    //delete-last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size --;
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node temp=tail;
        Node prev=head;
        while(prev.next!=tail){
            prev=prev.next;
        }
        tail=prev;
        tail.next=head;
        temp.next=null;
    }
    
    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.addFirst(3);
        list.addFirst(2);
        list.addLast(4);
        list.printLL();
        list.deleteFirst();
        list.printLL();
        list.deleteLast();
        list.printLL();
        
    }
}