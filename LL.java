// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    Node head;
    
    private int size;
    
    LL(){
        size = 0;
    }
    
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
            size ++ ;
        }
    }
    
    //add-first 
    
    public void addFirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        
        newNode.next= head;
        head=newNode;
    }
    
    //add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        
        Node currentNode=head;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        
        currentNode.next=newNode;
    }
    
    //printLL
    public void printLL(){
        Node currentNode=head;
        if(head ==null){
            System.out.print("List is empty");
            return;
        }
        while(currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
    
    //delete-First
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is already empty");
            return;
        }
        size--;
        head=head.next;
    }
    
    //delete-last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is already empty");
            return;
        }
        
        size --;
        if(head.next==null){
            head=null; //List has only one node
            return;
        }
        
        Node secondLast=head;
        Node lastNode=head.next;
        
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //getSize
    
    public int getSize(){
        return size;
    }
    
    //reverse
    public void reverseIterate(){
        if (head ==null){
            System.out.println("List is empty");
        }
        
        if(head.next==null){
            System.out.println("List has only one element");
        }
        Node prevNode=head;
        Node currentNode=head.next;
        
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;
            
            //update
            prevNode=currentNode;
            currentNode=nextNode;
        }
        
        head.next=null;
        head=prevNode;
    }
    
    //reverse-recursive
    
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        
        return newHead;
    }
    
    
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printLL();
        
        list.addLast("LL");
        list.printLL();
        
        list.addFirst("This");
        list.printLL();
        
        
        list.reverseIterate();
        list.printLL();
        
        list.head = list.reverseRecursive(list.head);
        list.printLL();
        
    }
}