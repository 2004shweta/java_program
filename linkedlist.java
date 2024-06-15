// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add first
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;

        }
        newNode.next=head;
        head=newNode;


    }
    //add last

    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void printlist(){

        if(head==null){
            System.out.println("list is empty");
            return;

        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-<");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    //delete fisrt
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;

    }
    //last deletee
    public void deletelast(){
        if(head==null){
            System.oyt.println("list i sempty");
            return;
        }
        if(head.next==null){
            heda=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;

        }
        secondlast.next=null;

    }



    public static void main(String args[]){
        LL list=new LL();
        list.addfirst("a");
        list.addfirst("b");
        list.addlast("c");
        list.printlist();

    }
}
