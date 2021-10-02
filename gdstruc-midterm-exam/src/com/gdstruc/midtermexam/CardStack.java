package com.gdstruc.midtermexam;

import java.util.EmptyStackException;

public class CardStack { //An array stack is used here

    private Card[] card;
    private Card[] cardHands;
    private Card[] discardCard;

    private int topDeck;
    private int cardHandtop;
    private int discarded;


    public CardStack(int capacity)
    {
        card = new Card[capacity];
        cardHands = new Card[capacity];
        discardCard = new Card[capacity];
    }

    public void push(Card card)
    {
        if (topDeck == this.card.length) // Used to resize the array
        {
            Card[] newStack = new Card[2 * this.card.length];
            System.arraycopy(this.card, 0, newStack, 0, this.card.length);
            this.card = newStack;
        }

        this.card[topDeck++] = card;

    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCards = card[--topDeck];
        card[topDeck] = null;
        return poppedCards;
    }

    public Card peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return card[topDeck - 1];
    }

    public boolean isEmpty()
    {
        return topDeck == 0;
    }

    public void printStack()
    {
        for (int i = topDeck - 1; i >= 0; i--)
        {
            System.out.println(card[i]);
        }
    }

    public void retrieve (int RetrievedCard)
    {

        while (RetrievedCard > discarded)
        {
            RetrievedCard--;
        }

        for (int j = RetrievedCard; j > 0; j--)
        {
            if (cardHandtop == cardHands.length)
            {
                Card[] newStack = new Card[2 * cardHands.length];
                System.arraycopy(cardHands, 0, newStack, 0, cardHands.length);
                cardHands = newStack;
            }

            cardHands[cardHandtop++] = discardCard[discarded - 1];
            popDiscarded();
        }

    }

    public void draw (int drawingCard)
    {

        while (drawingCard > topDeck)
        {
            drawingCard--;
        }

        for (int j = drawingCard; j > 0; j--)
        {
            if (cardHandtop == cardHands.length)
            {
                Card[] newStack = new Card[2 * cardHands.length];
                System.arraycopy(cardHands, 0, newStack, 0, cardHands.length);
                cardHands = newStack;
            }

            cardHands[cardHandtop++] = card[topDeck - 1];
            pop();
        }

    }


    public void discard (int DiscardedCard)
    {

        while (DiscardedCard > cardHandtop)
        {
            DiscardedCard--;
        }

        for (int j = DiscardedCard; j > 0; j--)
        {
            if (discarded == discardCard.length)
            {
                Card[] newStack = new Card[2 * discardCard.length];
                System.arraycopy(discardCard, 0, newStack, 0, discardCard.length);
                discardCard = newStack;
            }

            discardCard[discarded++] = cardHands[cardHandtop - 1];
            popHand();
        }

    }




    public Card peekHand()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return cardHands[cardHandtop - 1];
    }

    public Card peekDiscarded()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return discardCard[discarded - 1];
    }

    public Card popHand()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCards = cardHands[--cardHandtop];
        cardHands[cardHandtop] = null;
        return poppedCards;
    }

    public Card popDiscarded()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCards = discardCard[--discarded];
        discardCard[discarded] = null;
        return poppedCards;
    }

    public void displayInfo ()
    {

        System.out.println("How many cards you have in your hand: " + cardHandtop);
        for (int i = cardHandtop; i > 0; i--)
        {
            int j = 0;
            System.out.println(cardHands[i - 1]);
        }

        System.out.println("How many cards in the deck: " + topDeck);
        System.out.println("How many cards that have been discarded: " + discarded);

    }

    public int getTopDeck()
    {

        return topDeck;

    }

}
