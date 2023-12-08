// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class queueImpl {

           static Node front=null;
           static Node rear=null;
        class Node{
            int value;
            Node next;
            Node(int value){
                this.value=value;
                this.next=null;
            }
        }

            public void Enqueue(int x){
                Node newNode=new Node(x);
                if(rear==null){
                    front=rear=newNode;
                    return;
                }
                    newNode.next=front;
                    front=newNode;

            }
            public void Dequeue(){
                if(rear==null)
                    return;
                Node temp=front;
                while(temp.next!=rear){
                    temp=temp.next;
                }
                rear=temp;
                temp=temp.next;
                rear.next=null;
                if(front==null && rear==null){
                    front=null;
                    rear=null;
                }
            }
            public void Print(){
                Node temp=front;
                while(temp!=null){
                    System.out.println(temp.value);
                    temp=temp.next;
                }
            }
            public static void main(String[] args) {
                 queueImpl obj=new queueImpl();
                System.out.println("After enqueue");
                 obj.Enqueue(1);
                 obj.Enqueue(2);
                 obj.Enqueue(4);
                 obj.Print();
                System.out.println("After dequeue");
                 obj.Dequeue();
                 obj.Print();
            }

    }
