class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;
    }
    public void addafter(int data,int key){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp!=null && temp.data!=key){
            temp=temp.next;

        }
        if(temp==null){
            System.out.println("Key not found");
            return;

        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public void delete(int key){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.data==key){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=key){
            temp=temp.next;

        }
        if(temp.next==null){
            System.out.println("key is not found");
            return;
        }
        temp.next=temp.next.next;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addlast(4);
        list.print();
        // list.addafter(4,6);
    }

}
