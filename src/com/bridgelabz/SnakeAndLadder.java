package com.bridgelabz;

public class SnakeAndLadder {
    static int playerPosition = 0;
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game");
        System.out.println("Initial position : " + playerPosition);

        int diceValue = (int)(Math.random()*10)%6+1;
        System.out.println("Dice Value = " + diceValue);

        int randomOption = (int)(Math.random()*10%3); // generating random number for checking player position
        System.out.println("Choice = " + randomOption);

        switch (randomOption) {
            case 0:
                System.out.println("No Play");
                break;
            case 1:
                //ladder
                playerPosition = playerPosition + diceValue;
                System.out.println(playerPosition);
                break;
            case 2:
                //snake
                playerPosition = playerPosition - diceValue;
                if(playerPosition < 0) {
                    playerPosition = playerPosition + diceValue;
                }
                System.out.println(playerPosition);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
