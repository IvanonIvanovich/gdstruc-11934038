package com.gdstruc.module5hashtables;

public class Main {

    public static void main(String[] args) {

        Player Finanut = new Player(1,"Finanut", 43);
        Player LoLiLover = new Player(2,"LoLiLover", 69);
        Player RhydonMadicc = new Player(3,"Yoyostar", 78);
        Player KaraVan = new Player(4,"KaraVan", 68);
        Player Sakmeoff = new Player(5,"Sakmeoff", 100);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(Finanut.getName(), Finanut);
        hashtable.put(LoLiLover.getName(), LoLiLover);
        hashtable.put(RhydonMadicc.getName(), RhydonMadicc);
        hashtable.put(KaraVan.getName(), KaraVan);
        hashtable.put(Sakmeoff.getName(), Sakmeoff);

        System.out.println("The old hashtable: ");
        hashtable.printHashtable();
        hashtable.remove("KaraVan");
        hashtable.remove("Yoyostar");
        System.out.println("The new hashtable: ");
        hashtable.printHashtable();
        System.out.println("Printed player: ");
        System.out.println(hashtable.get("Sakmeoff"));
    }
}
