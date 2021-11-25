package com.gdstrucmodule2;

public class Main {

    public static void main(String[] args) {

        //player list
        Player esuna = new Player(1, "Esuna", 100);
        Player konpa = new Player(2, "Konpa", 69);
        Player sakmeoff = new Player(3, "Sakmeoff", 22);
        Player schmitler = new Player(4, "Schmitler", 420);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(schmitler);
        playerLinkedList.addToFront(sakmeoff);
        playerLinkedList.addToFront(konpa);
        playerLinkedList.addToFront(esuna);

        //removing the first element
        playerLinkedList.removeFirstElement();
        playerLinkedList.printList();

        System.out.print("\n----------------------------------------------------------------------\n");

        System.out.println("Linked list has the player named Konpa: " + playerLinkedList.contains(konpa));
        System.out.println("Location of Konpa within the linked list: " + playerLinkedList.indexOf(konpa));
        System.out.println("Linked list has the player named Sakmeoff: " + playerLinkedList.contains(sakmeoff));
        System.out.println("Location of Sakmeoff within the linked list: " + playerLinkedList.indexOf(sakmeoff));
        System.out.println("the current size of the Linked List= " + playerLinkedList.getSize());


    }
}
