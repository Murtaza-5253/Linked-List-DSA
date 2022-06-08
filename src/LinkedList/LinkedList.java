package LinkedList;

public class LinkedList
{
    private Link head;
    private Link tail;
    public int location=0;

    public LinkedList(){
        head=null;
        tail = null;
    }

    public void insertFirst(int data){
        Link link = new Link(data);
        if(head==null){
            head=link;
            tail=link;
        }
        else{
            link.next = head;
            head = link;
        }
        location++;
        System.out.println("Location:- "+location);
    }

    public void inserLast(int data){
        Link link = new Link(data);
        if(tail==null){
            head=link;
            tail=link;
        }else{
            link.next=tail;
            tail=link;
        }
        location++;
        System.out.println("Location:- "+location);
    }

    public void insernthPos(int data,int pos){
        Link link = new Link(data);
        if(head==null){
            head=link;
            tail=link;
        }else{
            Link temp = head;
            Link nextNode;
            while(temp!=null){
                nextNode = temp.next;
                if(temp.data==pos){
                    temp.next = link;
                    link.next = nextNode;
                }
                temp = temp.next;
            }
        }
    }
    public void deleteFirst() {
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            head = head.next;
        }

    }
    public void deleteLast() {
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Link secondlast = head;
            while(secondlast.next.next!=null){
                secondlast = secondlast.next;
                secondlast.next=null;
            }
        }

    }

    public void searchNode(int data){
        if(head==null){
            System.out.println("List is Empty");
        }
        else {
            int foundLoc = 1;
            Link temp = head;
            while(temp!=null){
                if(temp.data==data){
                    System.out.println("Node Found at :- "+foundLoc);
                }
                foundLoc++;
                temp = temp.next;
            }
        }
    }

    public int size(){
        int count=0;
        if(head==null){
            return count;
        }
        else{
            Link temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public void showList(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Link temp = head;
            while(temp!=null){
                System.out.println(temp.data+" -> ");
                temp = temp.next;
            }
        }
    }
}
