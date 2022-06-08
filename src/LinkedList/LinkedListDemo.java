package LinkedList;

import java.util.Scanner;

public class LinkedListDemo
{
    public static void main(String[] args) {
        System.out.println(".........................Welcome............................");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Linked List Operations");
            System.out.println("1. Insert First \n2. Insert Last \n3. Insert at nth position \n2. Delete First \n2. Delete Last \n2. Search \n2. Exit");

        }while(choice!=10);
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.insertFirst(40);
        linkedList.insertFirst(50);
        linkedList.insertFirst(60);
        linkedList.insertFirst(70);
        linkedList.insertFirst(80);
        linkedList.insertFirst(90);
        linkedList.insertFirst(100);
        linkedList.insertFirst(110);


    }
}
