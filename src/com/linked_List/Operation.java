package com.linked_List;

public class Operation {
    public static void addDataAtStart(){
        LinkedList linkedList =new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    // Created a method to add data at end.
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();

    }
    //created method for insert in between
    public static void insertInBetween(){
        LinkedList linkedList=new LinkedList();
        Node secondNode =linkedList.push(70);
        Node firstNode =linkedList.push(56);
        Node newNode =new Node(30);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInBetween(firstNode,newNode);
        System.out.println(                             );
        System.out.println("After");
        linkedList.print();
    }

    public static void pop(){
        LinkedList linkedList=new LinkedList();
        Node firstNode= linkedList.push(70);
        Node secondNode= linkedList.push(30);
        Node newNode=linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.pop();
        System.out.println(            );
        System.out.println("After Deleting First Element:");
        linkedList.print();
    }
    public static void popLast(){
        LinkedList linkedList=new LinkedList();
        Node firstNode= linkedList.push(70);
        Node secondNode= linkedList.push(30);
        Node newNode=linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        System.out.println(         );
        linkedList.popLast();
        System.out.println("After Deleting Last Element");
        linkedList.print();
    }
    //method to search specific value
    public static void search(){
        LinkedList linkedList=new LinkedList();
        Node firstNode= linkedList.push(70);
        Node secondNode= linkedList.push(30);
        Node newNode=linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.search(30);
    }
}
