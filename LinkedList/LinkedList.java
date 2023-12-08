class LinkedList {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void print(){
         Node temp=head;
         while(temp.next!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
        System.out.println(temp.data);
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteFirst(){
        if(head!=null){
            head=head.next;
        }
    }
    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void addInMiddle(int index,String data){
        Node newNode=new Node(data);
        Node temp=head;
        while(index!=0){
            temp=temp.next;
            index--;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public void deleteFromMiddle(int index){
        Node temp=head;

        while(index!=0){

            temp=temp.next;
            index--;
        }
        temp.next=temp.next.next;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node later=curr.next;
        while(curr!=null){
            later=curr.next;
            curr.next=prev;
            prev=curr;
            curr=later;
        }
        head=prev;
    }
    public static void main(String[] args) {
            LinkedList list=new LinkedList();
            list.addFirst("is");
            list.addFirst("this");
            list.addLast("a");
            list.addLast("Linked");
            list.addLast("List");
            list.print();
            System.out.println("Reversed Linked List");
            list.reverse();
            list.print();
            System.out.println("\nAfter deleting first node");
            list.deleteFirst();
            list.print();
            System.out.println("\nAfter deleting last node");
            list.deleteLast();
            list.print();
            list.addInMiddle(1,"String");
            list.print();
            list.deleteFromMiddle(1);
            list.print();
    }
}

