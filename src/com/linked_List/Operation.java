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
}
