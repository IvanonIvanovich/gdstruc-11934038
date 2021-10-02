package com.gdstrucmodule2;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Esuna", 100));
        playerList.add(new Player(2, "Konpa", 69));
        playerList.add(new Player(3, "Yee", 24));

        //access an Element
        //System.out.println(playerList.get(1));

        playerList.add(2, new Player(420, "Schmitler", 420));

        playerList.remove(2);

        //System.out.println(playerList.contains(new Player(2, "Konpa", 69)));

        //System.out.println(playerList.indexOf(new Player(2, "Konpa", 69)));

        System.out.println("LinkedList:" + playerList);

        System.out.println("The size of the linked list is: "
                + playerList.size());

//       for (Player p : playerList)
//     {
//       System.out.println(p);
// }
    }
}
