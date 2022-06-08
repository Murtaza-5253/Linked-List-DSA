package LinkedList;

public class LinkedList
{
    private Link head;
    private Link tail;
    int location;

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

    public void display(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Link temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
        }
    }
}
