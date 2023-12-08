class StackDS {
    ListNode top=null;
        class ListNode{
            int value;
            ListNode next;
            ListNode(int value){
                this.value=value;
                this.next=null;
            }
        }
        public void push(int x){
            ListNode node=new ListNode(x);
            if(top==null){
                top=node;
            }else{
                node.next=top;
                top=node;
            }
        }
        public void print(){
            ListNode temp=top;
            while(temp!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
        }
        public int peek(){
            if(top!=null){
                return top.value;
            }else{
                return 0;
            }
        }
        public void pop(){
            if(top!=null){
                top=top.next;
            }else{
                return;
            }
        }
        public void pushBottom(int x){
            ListNode node=new ListNode(x);
            ListNode temp=top;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }

        public void reverse(){
            ListNode prev=null;
            ListNode curr=top;
            ListNode later=null;
            while(curr!=null){
                later=curr.next;
                curr.next=prev;
                prev=curr;
                curr=later;
            }
            top=prev;
        }
    public static void main(String[] args) {
            StackDS obj=new StackDS();
        System.out.println("Push");
            obj.push(1);
            obj.push(2);
            obj.push(3);
        System.out.println("Added to bottom");
            obj.pushBottom(4);
            obj.print();
        System.out.println("Reverse");
        obj.reverse();
            obj.print();

        System.out.println("Peek");
        System.out.println(obj.peek());
        System.out.println("Pop");
            obj.pop();
             obj.print();
    }
}