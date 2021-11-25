package com.gdstrucmodule2;



public class PlayerLinkedList {
    private PlayerNode head;
    public int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("Head -> ");
        while(current != null)
        {
            System.out.println(current.getPlayer());
            System.out.println(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removeFirstElement()
    {
        PlayerNode current = head;
        head = head.getNextPlayer();
        current = null;
    }

    public int getSize()
    {
        PlayerNode current = head;
        size = 0;
        while(current != null)
        {
            size++;
            current = current.getNextPlayer();
        }
        return size;
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;
        while(current != null)
        {
            if(current.getPlayer().equals(player))
            {
                return true;
            }
            else
            {
                current = current.getNextPlayer();
            }
        }
        return false;
    }

    public int indexOf(Player player)
    {
        int x = 0;
        PlayerNode current = head;
        while(current != null)
        {
            if(current.getPlayer().equals(player))
            {
                return x;
            }
            current = current.getNextPlayer();
            x++;
        }
        return -1;
    }
}
