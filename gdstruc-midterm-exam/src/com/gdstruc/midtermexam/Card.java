package com.gdstruc.midtermexam;

import java.util.Objects;

public class Card {

    private String name;
    private int cardNumber;

    public Card(String name, int cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card cards = (Card) o;
        return cardNumber == cards.cardNumber && Objects.equals(name, cards.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cardNumber);
    }

    @Override
    public String toString() {
        return "{" + name + ", Card number: " + cardNumber + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }



}
