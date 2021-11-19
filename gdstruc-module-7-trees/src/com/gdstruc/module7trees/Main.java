package com.gdstruc.module7trees;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(120);
        tree.insert(564);
        tree.insert(214);
        tree.insert(717);
        tree.insert(177);
        tree.insert(678);
        tree.insert(69);
        tree.insert(420);
        tree.insert(1337);

        System.out.println("In Ascending Order:");
        tree.traverseInOrder();

        System.out.println("\nIn Descending order:");
        tree.traverseInOrderDescending();

        System.out.println("\nMIN: " + tree.getMin());
        System.out.println("\nMAX: " + tree.getMax());


    }
}
