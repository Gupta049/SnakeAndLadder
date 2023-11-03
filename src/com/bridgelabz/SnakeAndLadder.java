package com.bridgelabz;

public class SnakeAndLadder {
    static int playerPosition = 0;
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game");
        System.out.println("Initial position : " + playerPosition);
        int diceValue = (int)(Math.random()*10)%6+1;
        System.out.println("Dice Value = " + diceValue);
    }
}
